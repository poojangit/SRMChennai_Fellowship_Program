package com.bridgelabz.classandobjects.leveltwo;

public class ShoppingCart {
	// creating a attributes
	private CartItem cartItem;
	// initializing the attributes using constructor
	public void addItem(String itemName, double price, int quantity) {
		//	condition to add the items if the cart is empty
		if(cartItem == null) {
			cartItem = new CartItem(itemName, price, quantity);
			System.out.println(quantity + " x " + itemName + " added to the cart.");
		}
		else {
			System.out.println("Cart already has an Item");
		}
	}
	// method to remove the item from the cart
	public void removeItem() {
		//	condition if cart is not empty then remove the item
		if(cartItem!= null) {
			System.out.println(cartItem.getItemName() + " removed from the cart" );
			cartItem = null;
		} else {
			System.out.println("No item in the cart to remove");
		}
	}
	//  method to display the totalcost
	public void displayTotalCost() {
		if(cartItem != null) {
			System.out.println("Total cost for " + cartItem.getItemName() + " is "+ cartItem.getTotalPrice() );
		}
	}
	//  main method
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItem("pens", 100, 2);
		cart.displayTotalCost();
		cart.removeItem();
		System.out.println("----------------");
		cart.addItem("eraser", 50, 1);
		cart.displayTotalCost();
	}
}
