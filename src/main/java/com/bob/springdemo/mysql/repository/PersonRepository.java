package com.bob.springdemo.mysql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bob.springdemo.mysql.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findByName(String name);

	List<Person> findByAddress(String address);

	//from跟的名称要和类名一致，区分大小写的，比如Person
	@Query("select p from Person p where p.name=:name and p.address=:address")  //hql语句
	List<Person> findByNameAndAddress(@Param("name") String name,
			@Param("address") String address);

}
