package com.jay.spring_boot.mybatis.annotation;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import com.jay.spring_boot.mybatis.Student;

@Mapper
public interface StudentMapper {
	@Select("select * from Student where id = #{id}")
	Student findStudentById(@Param("name") int id);
	
}
