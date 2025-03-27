package com.bridgelabz.inheritance.multilevelinheritance;

// Main class
public class OnlineRetailOrderManagement {
	//	main method
	public static void main(String[] args) {
		// new object creation of Order class
		Order order = new Order(78258, "2023-02-16" );
		System.out.println("Order Status : " + order.getOrderStatus());
		// new object creation of shipped Order class
		ShippedOrder shippedOrder = new ShippedOrder(2442, "2024-02-12", "FG9272");
		System.out.println("Order Status : " + shippedOrder.getOrderStatus());
		// new object creation of delivered Order class
		DeliveredOrder deliveredOrder = new DeliveredOrder(72662, "2021-02-12", "HF1027", "2020-08-12");
		System.out.println("Order Status : " + deliveredOrder.getOrderStatus());
	}
}
