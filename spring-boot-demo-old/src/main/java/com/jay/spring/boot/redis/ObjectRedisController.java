package com.jay.spring.boot.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis/object")
public class ObjectRedisController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonDao personDao;

	@RequestMapping("/setPerson")
	public void setPerson(String id, String name, int age) {
		logger.debug("set接收到参数 id={},name={},age={}", id, name, age);
		Person person = new Person(id, name, age);
		personDao.save(person);
	}
	//例如：http://localhost:8081/redis/object/getPerson?id=1
	@RequestMapping("/getPerson")
	public Person getPerson(@RequestParam("id") String id) {
		logger.debug("get接收到参数 id={}", id);
		return personDao.getPerson(id);
	}
}
