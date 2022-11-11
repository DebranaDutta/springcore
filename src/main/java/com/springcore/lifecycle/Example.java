package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;
	
	public Example() {
		super();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("Setting subject of Example");
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method of Example");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method of Example");
	}
}
