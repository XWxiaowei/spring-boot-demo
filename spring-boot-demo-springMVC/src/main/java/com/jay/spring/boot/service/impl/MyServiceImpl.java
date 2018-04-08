package com.jay.spring.boot.service.impl;

import com.jay.spring.boot.config.FooProperties;
import com.jay.spring.boot.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiang.wei
 * @create 2018/4/4 11:19
 */
@Service("myService")
public class MyServiceImpl implements MyService {
    @Autowired
    private  FooProperties properties;


    @Override
    public String getProperties() {
        return properties.getRemoteAddress();
    }
}
