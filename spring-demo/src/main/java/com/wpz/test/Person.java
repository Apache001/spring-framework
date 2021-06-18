package com.wpz.test;

import lombok.Data;
import org.springframework.beans.factory.parsing.SourceExtractor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author bytedance
 */
//@Configuration
public class Person {

	private Integer age;

	private String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(Integer age, String name) {
		this.age = age;
		this.name = name;
		System.out.println("执行带参数构造方法，name=" + name);
	}

	public Person() {
		System.out.println("执行空构造方法");
	}
}
