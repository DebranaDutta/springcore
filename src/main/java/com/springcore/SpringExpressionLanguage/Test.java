package com.springcore.SpringExpressionLanguage;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpringExpressionLanguage/SpringExpression_config.xml");
		Demo demo=(Demo)context.getBean("obj");
		System.out.println(demo);
		
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression=temp.parseExpression("22+66");
		System.out.println(expression.getValue());		
	}
}
