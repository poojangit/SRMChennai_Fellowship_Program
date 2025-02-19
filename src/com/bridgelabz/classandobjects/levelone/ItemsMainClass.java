package com.bridgelabz.classandobjects.levelone;

public class ItemsMainClass {
	// main method
	public static void main(String[] args) {
		//	created a two items objects
		Items item1 = new Items(001,"Bag", 1000 );
		Items item2 = new Items(002, "charger", 1200);
		//	displaying the details of items and total price by calling the methods 
		System.out.println("The details of Items : ");
		item1.displayItems();
		System.out.println("Total price : " + item1.calculateTotalPrice(2));
		item2.displayItems();
		System.out.println("Total price : "+ item2.calculateTotalPrice(5));
	}

}
