package com.bridgelabz.classandobjects.levelone;

public class MobilePhone {
	// declaring the attributes
	private String brand;
	private String model;
	private double price;
	// constructors to initialize the variables
	public MobilePhone(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	// methods to display the details of Mobile details
	public void displayMobile() {
		System.out.println("\nBrand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}

}
