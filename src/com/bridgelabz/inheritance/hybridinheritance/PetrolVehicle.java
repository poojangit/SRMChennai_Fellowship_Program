package com.bridgelabz.inheritance.hybridinheritance;

//Subclass PetrolVehicle inheriting from Vehicle and implementing Refillable interface
public class PetrolVehicle extends Vehicle implements Refuelable{
	public PetrolVehicle(int maxSpeed, String model) {
		super(maxSpeed, model);
	}
	@Override
	public void refuel() {
		System.out.println("Petrol Vehicle " + model + " is refueling");
	}

}
