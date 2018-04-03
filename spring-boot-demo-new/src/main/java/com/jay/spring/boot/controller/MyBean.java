package com.jay.spring.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author xiang.wei
 * @create 2018/4/3 15:40
 */
@Component
public class MyBean implements CommandLineRunner{
    private Logger logger = LoggerFactory.getLogger(MyBean.class);
    @Override
    public void run(String... args) throws Exception {
        System.out.println("项伟测试");
        logger.info("项伟测试");
    }
}
