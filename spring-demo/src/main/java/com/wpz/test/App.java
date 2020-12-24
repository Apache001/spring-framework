package com.wpz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 * @author bytedance
 */
public class App {
	public static void main( String[] args ) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.getName());
	}
}
