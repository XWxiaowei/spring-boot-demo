package com.jay.spring.boot.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author lenovo
 * @Desc Spring Boot 启动监听类
 * 在该事件中可以获取SpringApplication对象，可以做一些执行前的设置
 *
 */
public class MyApplicationStartedEventListener implements
		ApplicationListener<ApplicationStartedEvent> {
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		SpringApplication app=event.getSpringApplication();
		// 不显示banner信息
		app.setBannerMode(Mode.OFF);
		logger.info("MyApplicationStartedEventListener....");
	}

}
