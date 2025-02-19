package com.bridgelabz.classandobjects.levelone;
//food delivery app
public class Restaurant {
	//attributes
	private String name;
	private String location;
	private String[] foodItems;
	// constructor
	public Restaurant(String name, String location, String[] foodItems) {
		this.name = name;
		this.location = location;
		this.foodItems = foodItems;
	}
	// method to display restaurant details
	public void displayDetails() {
		System.out.println("Restaurant Name : " + name);
		System.out.println("Location " + location);
		System.out.println("Food items : ");
		for(String items : foodItems) {
			System.out.println("-" + items);
		}
	}
	//method to check if the food item is available or not
	public boolean isFoodAvailable(String food) {
		for(String item: foodItems) {
			if(item.equalsIgnoreCase(food)) {
				return true;
			}
		}
		return false;
	}


}
