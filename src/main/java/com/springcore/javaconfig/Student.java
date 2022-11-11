package com.springcore.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.springcore.lifecycle.Samosa;

@Component("obj")
public class Student {

	private Samosa samosa;
	
	public Student() {
		super();
	}
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void Study() {
		System.out.println("reading book");
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
	
}
