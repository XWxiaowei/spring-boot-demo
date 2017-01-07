package com.bob.springdemo.mybatis.xml;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bob.springdemo.mybatis.Student;

/**
 * @author bob.xiang
 * 功能说明：测试二
 *
 */
@Component  //未指明功能类型的注解
public class StudentDao {
	@Autowired
	private SqlSessionTemplate  sqlSessionTemplate;
	
	public Student selectStudent(int id){
		return sqlSessionTemplate.selectOne("selectById", id);
	}
	
	
}
