package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public Samosa() {}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of Samosa");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Init method of Samosa");
	}

	public void destroy() {
		System.out.println("Destroy method of Samosa");
	}
}
