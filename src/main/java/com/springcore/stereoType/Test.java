package com.springcore.stereoType;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereoType/stereoType_config.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println("student1:"+student1.hashCode());
		Student student2=(Student)context.getBean("student1");
		System.out.println("student2:"+student2.hashCode());
		
		Student student3 = (Student) context.getBean("student2");
		System.out.println("student3:"+student3.hashCode());
		Student student4 = (Student) context.getBean("student2");
		System.out.println("student4:"+student4.hashCode());
	}
}
