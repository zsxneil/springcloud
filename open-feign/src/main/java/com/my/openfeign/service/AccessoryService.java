package com.my.openfeign.service;

import com.my.openfeign.model.Attachment;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "accessoryService",
        url = "http://172.20.69.42:9088/accessory-service/",
//        fallback = AccessoryService.DefaultFallback.class,
        fallbackFactory = AccessoryService.AccessoryServiceFallbackFactory.class)
public interface AccessoryService {

    static final Logger log = LoggerFactory.getLogger(AccessoryService.class);

    @GetMapping("v1/attachment/meta/{id}")
    Attachment getAttachmentById(@PathVariable("id") String id);

    @Component
    public class DefaultFallback implements AccessoryService {

        @Override
        public Attachment getAttachmentById(@PathVariable("id") String id) {
            return null;
        }
    }

    @Component
    public class AccessoryServiceFallbackFactory implements FallbackFactory<AccessoryService> {

        @Override
        public AccessoryService create(Throwable cause) {
            log.info("fallback; reason was:{} " , cause.getMessage());
            return new AccessoryService() {
                @Override
                public Attachment getAttachmentById(String id) {
                    return null;
                }
            };
        }
    }

}
