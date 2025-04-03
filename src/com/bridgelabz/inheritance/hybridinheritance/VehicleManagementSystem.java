package com.bridgelabz.inheritance.hybridinheritance;

//Main Class to test the functionality
public class VehicleManagementSystem {
 public static void main(String[] args) {
     ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
     PetrolVehicle pv = new PetrolVehicle(200, "Ford Mustang");
     ev.charge();
     pv.refuel();
 }
}
