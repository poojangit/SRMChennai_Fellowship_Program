package com.bridgelabz.constructors.level1;
//Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost.
public class CarRental {
	 private String customerName;
	    private String carModel;
	    private int rentalDays;
	    private double costPerDay;
	    private double totalCost;

	    // Default constructor
	    public CarRental() {
	        this.customerName = "Unknown";
	        this.carModel = "Not Assigned";
	        this.rentalDays = 0;
	        this.costPerDay = 0;
	        this.totalCost = 0;
	    }

	    // Parameterized constructor to initialize rental details
	    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	        this.costPerDay = costPerDay;
	        this.totalCost = calculateTotalCost();
	    }

	    // Method to calculate total cost
	    private double calculateTotalCost() {
	        return rentalDays * costPerDay;
	    }

	    // Method to display rental details
	    public void displayRentalDetails() {
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Car Model: " + carModel);
	        System.out.println("Rental Days: " + rentalDays);
	        System.out.println("Cost per Day: " + costPerDay);
	        System.out.println("Total Rental Cost: " + totalCost);
	    }

	    public static void main(String[] args) {
	        // Creating a CarRental object
	        CarRental rental1 = new CarRental("Pooja", "Toyota Camry", 5, 1200);
	        
	        // Display rental details
	        System.out.println("Car Rental Details:");
	        rental1.displayRentalDetails();
	    }
}
