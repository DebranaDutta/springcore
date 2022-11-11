package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World");
		ApplicationContext context=new ClassPathXmlApplicationContext(" com/springcore/ref/referenceConfig.xml");
		Car car=(Car)context.getBean("Car1");
		System.out.println(car);
		System.out.println(car.getEngine());
	}
}
