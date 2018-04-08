package com.jay.spring.boot.controller;

import com.jay.spring.boot.config.FooProperties;
import com.jay.spring.boot.service.MyService;
import com.jay.spring.boot.service.impl.MyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiang.wei
 * @create 2018/4/2 13:54
 */
@Controller
public class SampleController {
    @Autowired
    private MyService myService;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return myService.getProperties();
    }

}
