package com.bob.springdemo.mybatis.xml;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bob.springdemo.mybatis.Student;

@Mapper
public interface StudentMapper1 {

	public Student selectById(int id);

	public List<Student> likeName(String name);

	public String getNameById(int id);
}
