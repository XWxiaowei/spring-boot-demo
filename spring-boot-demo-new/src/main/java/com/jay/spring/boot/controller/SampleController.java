package com.jay.spring.boot.controller;

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
@EnableAutoConfiguration
public class SampleController {
    @Order
    private MyBean myBean;
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
//        SpringApplication app = new SpringApplication(SampleController.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
        SpringApplication.run(SampleController.class, args);
    }
}
