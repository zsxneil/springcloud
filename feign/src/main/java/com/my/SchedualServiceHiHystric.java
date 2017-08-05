package com.my;

import org.springframework.stereotype.Component;

/**
 * Created by neil on 2017/8/3.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
