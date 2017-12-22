package com.jay.spring.boot.mybatis.annotation;

import com.jay.spring.boot.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mybatis/annot")
public class StudentController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private StudentMapper studentMapper;

	@RequestMapping("/id")
	public Student findStrudent(int id) {
		logger.debug("接收到的参数id={}", id);
		return studentMapper.findStudentById(id);

	}
}
