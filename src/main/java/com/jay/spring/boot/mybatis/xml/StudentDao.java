package com.jay.spring.boot.mybatis.xml;

import com.jay.spring.boot.model.Student;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bob.xiang
 * 功能说明：测试二
 *
 */
//未指明功能类型的注解
@Component
public class StudentDao {
	@Autowired
	private SqlSessionTemplate  sqlSessionTemplate;
	
	public Student selectStudent(int id){
		return sqlSessionTemplate.selectOne("selectById", id);
	}
	
	
}
