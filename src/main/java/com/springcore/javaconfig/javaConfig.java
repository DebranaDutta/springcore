package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.springcore.lifecycle.Samosa;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa=new Samosa();
		return samosa;
	}
	
	@Bean
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	} 
}
