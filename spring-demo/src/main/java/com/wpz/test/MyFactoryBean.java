package com.wpz.test;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author wangpengzhe
 * @date 2021/4/25 2:11 下午
 * @desc
 */
public class MyFactoryBean implements FactoryBean<Person> {
	@Override
	public Person getObject() throws Exception {
		return new Person();
	}

	@Override
	public Class<?> getObjectType() {
		return Person.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
