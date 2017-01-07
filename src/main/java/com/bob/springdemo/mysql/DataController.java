package com.bob.springdemo.mysql;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bob.springdemo.mysql.domain.Person;
import com.bob.springdemo.mysql.repository.PersonRepository;

@RestController
public class DataController {
	protected static Logger logger = LoggerFactory
			.getLogger(DataController.class);

	@Autowired
	PersonRepository personRepository;

	// 请求地址，例如：http://localhost:8080/save?name=sam&&address=beijing&&age=1
	@RequestMapping("/save")
	public Person save(String name, String address, Integer age) {
		logger.debug("save 开始");
		Person p = personRepository.save(new Person(null, name, age, address));
		logger.debug("save 结束");
		return p;
	}

	// 请求地址，例如：http://localhost:8080/q1?address=beijing
	@RequestMapping("/q1")
	public List<Person> q1(String address) {
		logger.debug("q1 开始");
		logger.debug("q1 接收参数address={}", address);
		List<Person> people = personRepository.findByAddress(address);
		return people;
	}
	// 请求地址，例如：http://localhost:8080/q2?name=sam&&address=beijing
	@RequestMapping(value = "q2", method = RequestMethod.GET)
	public List<Person> findByNameAndAddress(@RequestParam("name") String name,
			@RequestParam("address") String address) {
		logger.debug("q2 开始");
		logger.debug("q2 接收参数name={},address={}", name,address);
		List<Person> people = personRepository.findByNameAndAddress(name,address);
		return people;
	}
}
