package com.bob.springdemo.mysql.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //@Entity说明被这个注解修饰的类应该与一张数据库表相对应，表的名称可以由类名推断
@Table(name="Person")
public class Person {
	
	@Id //@Id注解修饰的属性应该作为表中的主键处理
	@GeneratedValue(strategy = GenerationType.AUTO) //@GeneratedValue修饰的属性应该由数据库自动生成，而不需要明确指定
	private Long id;

	private String name;

	private Integer age;

	private String address;

	public Person() {
		super();
	}

	public Person(Long id, String name, Integer age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
