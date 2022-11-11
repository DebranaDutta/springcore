package com.springcore.ref;

public class Car {
	private int DISPLACEMENT;
	private String TYRE;
	private Engine engine;

	public Car() {
	}

	public Car(int dISPLACEMENT, String tYRE, Engine engine) {
		super();
		DISPLACEMENT = dISPLACEMENT;
		TYRE = tYRE;
		this.engine = engine;
	}

	public int getDISPLACEMENT() {
		return DISPLACEMENT;
	}

	public void setDISPLACEMENT(int dISPLACEMENT) {
		DISPLACEMENT = dISPLACEMENT;
	}

	public String getTYRE() {
		return TYRE;
	}

	public void setTYRE(String tYRE) {
		TYRE = tYRE;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [DISPLACEMENT=" + DISPLACEMENT + ", TYRE=" + TYRE + ", engine=" + engine + "]";
	}

}
