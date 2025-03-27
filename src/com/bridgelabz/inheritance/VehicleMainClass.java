package com.bridgelabz.inheritance;

public class VehicleMainClass {
	public static void main(String[] args) {
		// Vehicle car = new Vehicle(100, "Petrol");
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Car(456, "Petrol", 5);
		vehicles[1] = new Truck(129, "Diesel", 5000);
		vehicles[2] = new Motorcycle(180, "Petrol", "Sport");

		for(Vehicle vehicle : vehicles) {
			System.out.println("\nVehicle Information");
			vehicle.displayInfo();
			System.out.println("-".repeat(30));
		}
	}

}
