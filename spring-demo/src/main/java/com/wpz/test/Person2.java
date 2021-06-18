package com.wpz.test;

import lombok.Data;

/**
 * @author bytedance
 */
public class Person2 {
	private String tesName;

	public String getTesName() {
		return tesName;
	}

	public void setTesName(String tesName) {
		this.tesName = tesName;
	}

	public Person2() {
		System.out.println("person2 构造方法");
	}
}
