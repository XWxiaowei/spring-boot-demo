package com.jay.spring.boot.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiang.wei
 * @create 2018/4/4 11:11
 */
@Configuration
@EnableConfigurationProperties(FooProperties.class)
public class MyConfiguration {
}
