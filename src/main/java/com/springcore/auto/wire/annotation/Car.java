package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier("engine2")
	private Engine engine;

	public Car() {
	}
	
	
	public Car(Engine engine) {
		super();
		this.engine = engine;
		System.out.println("Constructor Injection");
	}
	public Engine getEngine() {
		return engine;
	}

	
	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("Setter Injection");
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
}
