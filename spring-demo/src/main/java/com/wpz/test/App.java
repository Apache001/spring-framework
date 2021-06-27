package com.wpz.test;


import com.wpz.aop.service.UserManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * Hello world!
 *
 * @author bytedance
 */
@Slf4j
public class App {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aoptest.xml");
		UserManagerService userManagerService = (UserManagerService) context.getBean("userManager");
		userManagerService.findUserById(123);
//		Person person = (Person) context.getBean("person");
//		System.out.println(person.getName());
//		System.out.println(person.getAge());
	}
}
