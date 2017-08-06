package com.my;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${foo}")
	String foo;

	/**
	 * 测试时，更改git中的配置文件，此处访问http://localhost:8881/hi的返回值未更新,重启后才能更新，原因暂未知
	 *
	 * springcloud-bus中有解决方案，配置rabbitmq后，通过http://localhost:8881/bus/refresh更新配置，不需要重启服务
	 * @return
	 */
	@RequestMapping(value = "/hi")
	public String hi() {
		return foo;
	}
}
