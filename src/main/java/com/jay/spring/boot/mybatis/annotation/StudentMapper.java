package com.jay.spring.boot.mybatis.annotation;

import com.jay.spring.boot.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

@Mapper
public interface StudentMapper {
	@Select("select * from Student where id = #{id}")
	Student findStudentById(@Param("name") int id);
	
}
