package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ciconfig.xml");
		Person person1=(Person)context.getBean("person1");
		Person person2=(Person)context.getBean("person2");
		Person person3=(Person)context.getBean("person3");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		Adition adition1=(Adition)context.getBean("addition1");
		adition1.doSum();
		Adition adition2=(Adition)context.getBean("addition2");
		adition2.doSum();
	}
}
