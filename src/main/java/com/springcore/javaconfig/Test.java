package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/javaconfig/Config.xml");
		Student student= (Student)context.getBean("obj");*/
		
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
		Student student= (Student)context.getBean("getStudent");
		student.Study();
		
	}
}
