package com.bridgelabz.inheritance.hybridinheritance;

//main class
public class RestaurantManagementSystem {
	// main method
	public static void main(String[] args) {
		//	create a Chef object
		Chef chef = new Chef("Prasheel", 14);
		chef.performDuties();
		//	creating a waiter object
		Waiter waiter = new Waiter("Dheeraj", 23);
		waiter.performDuties();
	}

}
