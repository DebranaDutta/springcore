package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeCycleConfig.xml");
		Samosa samosa1 = (Samosa) context.getBean("samosa1");
		Pepsi pepsi=(Pepsi)context.getBean("pepsi1");
		Example example1=(Example)context.getBean("example1");
		System.out.println("***************************************************************************************************");
		System.out.println(samosa1);
		System.out.println(pepsi);
		System.out.println(example1);
		/* registering shutdown hook */
		context.registerShutdownHook();
	}
}
