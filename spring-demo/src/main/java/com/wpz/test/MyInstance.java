package com.wpz.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstance implements InstantiationAwareBeanPostProcessor {

	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanClass == Person.class) {
			System.out.println("postProcessBeforeInstantiation执行");
			return null;
		}

		return null;
	}

	/**
	 * 在实例化之后，postProcessBeforeInitialization之前执行
	 * @param bean
	 * @param beanName
	 * @return
	 * @throws BeansException
	 */
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			System.out.println("postProcessAfterInstantiation执行");
			System.out.println(((Person) bean).getName());
			return true;
		}

		return true;
	}
}
