package com.bridgelabz.variablesmethods;
//Problem 3: Vehicle Registration
//Create a Vehicle class to manage the details of vehicles:
//Instance Variables: ownerName, vehicleType.
//Class Variable: registrationFee (fixed for all vehicles).
//Methods:
//An instance method displayVehicleDetails() to display owner and vehicle details.
//A class method updateRegistrationFee() to change the registration fee.

public class Vehicle {
	// instance variable declaration
	private String ownerName ;
	private String vehicleType;
	// class variable declaration 
	public static int registrationFee = 200;
	// constructor
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	// instance method to display the vehicle details
	public void displayVehicleDetails() {
		System.out.println("OwnerName: " + ownerName);
		System.out.println("Vehicle Type : " + vehicleType);
		System.out.println("Registration fee : " + registrationFee);

	}
	// class method to update the registration fee
	public static void updateRegistrationFee(int newRegistrationFee) {
		registrationFee = newRegistrationFee;
	}
	// main method
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Pooja N G", "Lamborgini");
		Vehicle vehicle2 = new Vehicle("Preethi", "Nano");
		System.out.println("----------Old registration fee---------");
		System.out.println("\nDisplaying the details of vehicle 1 ---");
		vehicle1.displayVehicleDetails();
		System.out.println("\nDisplaying the details of vehicle 2 ---");
		vehicle2.displayVehicleDetails();
		System.out.println();
		System.out.println("---------new registration fee---------- ");
		System.out.println();
		//	updating a new registration fee
		Vehicle.updateRegistrationFee(400);
		System.out.println("\nDisplaying the details of vehicle 1 ---");
		vehicle1.displayVehicleDetails();
		System.out.println("\nDisplaying the details of vehicle 2 ---");
		vehicle2.displayVehicleDetails();
	}


}
