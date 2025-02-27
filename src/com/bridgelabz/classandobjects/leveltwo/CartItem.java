package com.bridgelabz.classandobjects.leveltwo;

public class CartItem {
	// creating a attributes
	private String itemName;
	private double price;
	private int quantity;

	// define a constructor for initialize the variable
	public CartItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	// method to getting a total price
	public double getTotalPrice() {
		return quantity * price;
	}
	// method to getting a item name
	public String getItemName() {
		return itemName;
	}
	// method to getting the quantity
	public int quantity() {
		return 	quantity;																																																																			
	}

}
