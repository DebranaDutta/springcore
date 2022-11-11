package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.Car;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowareconfig_byName.xml");
		Car car1 = (Car) context1.getBean("Car1");
		System.out.println(car1);
		
		AbstractApplicationContext context2=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autowareconfig_byType.xml");
		Car car2 =(Car)context2.getBean("Car1");
		System.out.println(car2);
	}
}
