package com.springcore.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standalone_config.xml");
		Person person1=(Person)context.getBean("person1");
		Person person2=(Person)context.getBean("person2");
		System.out.println(person2);
		System.out.println(person1);
	}
}
