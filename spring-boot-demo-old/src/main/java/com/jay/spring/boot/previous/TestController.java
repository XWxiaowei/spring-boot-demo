package com.jay.spring.boot.previous;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static Logger logger=LoggerFactory.getLogger(TestController.class);	
//	@Value(value="${bob.name}")
	private String name;
	
//	@Value(value="${bob.number}")
	private String number;
	
	@RequestMapping("/first")
	public String index() {
		return "first page!";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello world Test!";
	}
	
	@RequestMapping("/testProperties")
	public Map<String, Object> testproperties() {
		logger.info("打印日志");
		Map<String, Object> map=new HashMap<>();
		map.put("name", name);
		map.put("number", number);
		map.put("age", 33);
		return map;
	}

	@RequestMapping("/users/{username}")
	public String userProfile(@PathVariable("username") String username) {
		return String.format("user %s", username);
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginGet() {
		return "Login get page";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String loginPost() {
		return "Login get  page";
	}
}
