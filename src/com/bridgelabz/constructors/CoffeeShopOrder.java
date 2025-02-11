package com.bridgelabz.constructors;

public class CoffeeShopOrder {
	// declaring the Attributes
	String customerName;
	String coffeeType ;
	int quantity ;
	double totalPrice;
	// default Contructor
	CoffeeShopOrder() {
		customerName = "Guest";
		coffeeType = "Regular";
		quantity = 1;
		totalPrice = calculatePrice();
	}
	// parameterized constructor
	CoffeeShopOrder(String customerName, String coffeeType, int quantity) {
		this.customerName = customerName;
		this.coffeeType = coffeeType;
		this.quantity = quantity;
		this.totalPrice = calculatePrice();
	}
	// copy constructor
	CoffeeShopOrder(CoffeeShopOrder previousOrder){
		this.customerName = previousOrder.customerName;
		this.coffeeType = previousOrder.coffeeType;
		this.quantity = previousOrder.quantity;
		this.totalPrice = previousOrder.totalPrice;
	}

	private double calculatePrice() {
		double pricePerCup = switch(coffeeType.toLowerCase()) {
		case "latte" -> 5.0;
		case "espresso" -> 4.0;
		case "cappuccino" -> 4.5;
		default -> 3.0; 
		};
		return pricePerCup*quantity;
	}
	// display order details
	void displayOrderDetails() {
		System.out.println("Customer name : " + customerName);
		System.out.println("Coffee type : " + coffeeType);
		System.out.println("Quantity : " + quantity);
		System.out.println("Total price : $" + totalPrice);
	}
	public static void main(String[] args) {
		//Default constructor
		CoffeeShopOrder order1 = new CoffeeShopOrder();
		System.out.println("Order 1: ");
		order1.displayOrderDetails();
		//parameterized constructor
		CoffeeShopOrder order2 = new CoffeeShopOrder("Alice", "Latte",3);
		System.out.println("\nOrder 2:");
		order2.displayOrderDetails();
		// copy constructor	
		CoffeeShopOrder order3 = new CoffeeShopOrder(order2);
		System.out.println("\nOrder 3 (Copy of Order 2): ");
		order3.displayOrderDetails();
	}
}
