package com.jay.spring.boot.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bob.xiang * SpringBoot与Redis集成 方式二，String
 */
@RestController
@RequestMapping("/redis/string")
public class StringRedisController {
	protected static Logger logger = LoggerFactory
			.getLogger(StringRedisController.class);
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
//	@Resource(name = "stringRedisTemplate")
//	ValueOperations<Object, Object> valOps;
//
//	//例如：http://localhost:8080/redis/string/set?key=address&value=guangzhou
//	@RequestMapping("/set")
//	public String set(String key, String value) {
//		logger.info("接受的参数 key={},value={}", key, value);
//		valOps.set(key, value);
//		return "设值成功";
//	}
//	@RequestMapping("/get")
//	public String get(String key){
//		logger.info("接受的参数key={}",key);
//		return (String) valOps.get(key);
//	}
	
}
