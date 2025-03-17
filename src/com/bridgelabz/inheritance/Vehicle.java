package com.bridgelabz.inheritance;

public class Vehicle {
	public double maxSpeed;
	public String fuelType;
	
	public Vehicle(double maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	public void displayInfo(){
		System.out.println("Maximum speed : " + maxSpeed);
		System.out.println("FuelType : " + fuelType);
	}
}
class Car extends Vehicle{
	public int seatCapacity;
	public Car(double maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Seat capacity : " + seatCapacity);
	}
}
class Truck extends Vehicle {

	public int loadingCapacity;
	public Truck(double maxSpeed, String fuelType, int loadingCapacity) {
		super(maxSpeed, fuelType);
		this.loadingCapacity = loadingCapacity;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Truck loading capacity : " + loadingCapacity);
	}
}
class Motorcycle extends Vehicle {
	public String model;
	public Motorcycle(double maxSpeed, String fuelType, String model) {
		super(maxSpeed, fuelType);
		this.model = model;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Model name is motorcycle : " + model);
	}
}