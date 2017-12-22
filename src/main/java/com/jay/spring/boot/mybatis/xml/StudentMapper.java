package com.jay.spring.boot.mybatis.xml;

import java.util.List;

import com.jay.spring.boot.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

	public Student selectById(int id);

	public List<Student> likeName(String name);

	public String getNameById(int id);
}
