package com.bridgelabz.variablesmethods;
//Problem 1: Product Inventory
//Create a Product class with:
//Instance Variables: productName, price.
//Class Variable: totalProducts (shared among all products).
//Methods:
//An instance method displayProductDetails() to display the details of a product.
//A class method displayTotalProducts() to show the total number of products created.

public class Product {
	// Instance variable - specific to each product
	private String productName;
	private double price;
	public static int totalProducts = 0;

	// class variable - shared among all the products
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		//	increment the product each time the product gets created
		totalProducts++;
	}
	// instance methods to display the products
	public void displayProductDetails() {
		System.out.println("Product Name : " + productName);
		System.out.println("Price : " + price);
	}
	// class methods to display the total products
	public static void displayTotalProducts() {
		System.out.println("Total Products : " + totalProducts);
	}
	// main method
	public static void main(String[] args) {
		// creating 3 different objects and assigning the different arguments
		Product product1 = new Product ("Office Bag", 700);
		Product product2 = new Product("Mobile" , 70000);
		Product product3 = new Product("Laptop " , 90000);

		System.out.println("Product 1 details : ----------");
		product1.displayProductDetails();
		System.out.println();
		System.out.println("Product 2 details : ----------");
		product2.displayProductDetails();
		System.out.println();
		System.out.println("Product 3 details : ----------");
		product3.displayProductDetails();

		//	 displaying the total products 
		System.out.print("Total products in the list are : ");
		displayTotalProducts();
	}

}
