package com.wpz.test;


import com.wpz.aop.service.impl.UserManagerServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 * @author bytedance
 */
@Slf4j
public class App {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
//		ApplicationContext context = new AnnotationConfigApplicationContext(Person.class);
		Person2 person2 = (Person2)context.getBean(Person2.class);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(list.subList(0, list.size() - 1));
		System.out.println(list.subList(0, list.size()));

//		UserManagerServiceImpl userManager = (UserManagerServiceImpl) context.getBean("userManager");
//
//		//可以查找张三
//		userManager.findUserById(1);
//
//		System.out.println("=====我==是==分==割==线=====");
//
//		try {
//			// 查不到数据，会抛异常，异常会被AfterThrowingAdvice捕获
//			userManager.findUserById(0);
//		} catch (IllegalArgumentException e) {
//		}

//		Person person = (Person) context.getBean("person");
//		System.out.println(person.getName());

//		BaseInfoResponse detailAddressResponse = JSON.parseObject(result, BaseInfoResponse.class);
//		  ObjectMapper mapper = new ObjectMapper();
//		JsonFactory factory = new MappingJsonFactory();
//		JsonParser jsonParser = factory.createParser(result);
//		BaseInfoResponse detailAddressResponse1 = mapper.readValue(jsonParser, BaseInfoResponse.class);
//		System.out.println(JSON.toJSON(detailAddressResponse1));
//		System.out.println(detailAddressResponse1);
	}

}
