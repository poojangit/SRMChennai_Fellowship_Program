package com.bridgelabz.inheritance.hybridinheritance;
//Subclass ElectricVehicle inheriting from Vehicle
public class ElectricVehicle extends Vehicle{

	public ElectricVehicle(int maxSpeed, String model) {
		super(maxSpeed, model);
	}
	public void charge() {
		System.out.println("Electric vehicle " + model + " is charging");
	}

}
