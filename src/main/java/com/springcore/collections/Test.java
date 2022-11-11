package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		Employee employee1=(Employee)context.getBean("Employee1");
		System.out.println(employee1);
		System.out.println(employee1.getPhones().getClass().getName());
		System.out.println(employee1.getAddress().getClass().getName());
		System.out.println(employee1.getCourses().getClass().getName());
		System.out.println(employee1.getProperties().getClass().getName());
	}
}
