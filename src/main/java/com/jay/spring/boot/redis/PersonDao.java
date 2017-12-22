package com.jay.spring.boot.redis;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

@Repository
// 用于标注数据访问组件，即DAO组件
public class PersonDao {
	@Autowired
	// 自动装配
	private RedisTemplate<Object, Object> redisTemplate;
	@Resource(name = "redisTemplate")
	ValueOperations<Object, Object> valOps;

	public void save(Person person) {
		valOps.set(person.getId(), person);
	}
	public Person getPerson(String id){
		return (Person) valOps.get(id);
	}
}
