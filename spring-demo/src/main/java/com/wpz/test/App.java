package com.wpz.test;


import com.wpz.aop.service.UserManagerService;
import com.wpz.circlerefrence.A;
import com.wpz.circlerefrence.B;
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
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("circlerefrence.xml");
		A bean = context.getBean(A.class);
		System.out.println(bean.getB());

		B bean1 = context.getBean(B.class);
		System.out.println(bean1.getA());

	}
}
