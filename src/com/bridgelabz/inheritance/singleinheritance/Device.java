package com.bridgelabz.inheritance.singleinheritance;

// super class : Device
public class Device {
	// attributes 
	protected String deviceId;
	protected String status;
	// constructor for initializing the attributes
	public Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	// methods for displaying the details
	public void displayStatus() {
		System.out.println("Device Id : " + deviceId);
		System.out.println("Status : " + status);
	}
}
// sub-class : Thermostat
class Thermostat extends Device {
	// attributes
	protected double temperatureSetting;
	// constructor for initializing the attributes
	public Thermostat(String deviceId, String status, double temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	// methods for displaying the details
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Temperature setting : " + temperatureSetting);
	}

}