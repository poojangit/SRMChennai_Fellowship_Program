package com.bridgelabz.classandobjects.levelone;

public class Items {
	// declaring the attributes
	private int itemCode ;
	private String itemName;
	private double price;
	// constructors for initializing the variables
	public Items(int itemCode, String itemName, double price) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	// methods to display the item's details
	public void displayItems() {
		System.out.println("\nItem Code : " + itemCode);
		System.out.println("Item Name : " + itemName);
		System.out.println("Item Price :  " + price);
	}
	// method to calculate the total price based on the quantity
	public double calculateTotalPrice(int quantity) {
		return price * quantity;
	}


}
