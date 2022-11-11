package com.springcore.constructorInjection;

public class Adition {
	private int a;
	private int b;
	public Adition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int, int");
	}
	public Adition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor : double, double");
	}
	public void doSum() {
		System.out.println("value of a "+this.a);
		System.out.println("value of b "+this.b);
		System.out.println("Sum is = "+(this.a+this.b));
	}
}
