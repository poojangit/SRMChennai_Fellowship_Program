package com.bridgelabz.classandobjects.levelone;

public class RestaurantMainClass {
	public static void main(String[] args) {
		String[] foodItems1 = {"Pizza", "Pasta", "Burger"};
		String[] foodItems2 = {"Sushi", "Ramen", " Tempura"};

		// create restaurant objects
		Restaurant restaurant1 = new Restaurant("Italian Delight", "DownTown", foodItems1);
		Restaurant restaurant2 = new Restaurant("Tokyo Treats", "Uptown", foodItems2);

		// Display details of each Restaurant
		System.out.println("----Restaurant 1----");
		restaurant1.displayDetails();
		System.out.println("----Restaurant 2----");
		restaurant2.displayDetails();

		// check food availability
		System.out.println("\n Checking food availability");
		System.out.println(" Is pasta available in Italian Delight?" + restaurant1.isFoodAvailable("Pasta"));
		System.out.println("Is Sushi availabe in Italian Delight" + restaurant1.isFoodAvailable("Sushi"));
	}
}
