package com.bridgelabz.practiceproblem.methods.level.two;

import java.util.Scanner;

public class UnitConverter {

	//Initializing the constants
	private static final double KM_TO_MILES = 0.621371;
	private static final double MILES_TO_KM = 1.60934;
	private static final double METERS_TO_FEET = 3.28084;
	private static final double FEET_TO_METERS = 0.3048;

	// Converts kilometers to miles.
	public static double convertKmToMiles(double km) {
		return km * KM_TO_MILES;
	}

	//Converts miles to kilometers.
	public static double convertMilesToKm(double miles) {
		return miles * MILES_TO_KM;
	}

	//Converts meters to feet.
	public static double convertMetersToFeet(double meters) {
		return meters * METERS_TO_FEET;
	}

	//Converts feet to meters.
	public static double convertFeetToMeters(double feet) {
		return feet * FEET_TO_METERS;
	}

	public static void main(String[] args) {
		// output
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the km to convert it to miles : ");
		double km = sc.nextDouble();
		System.out.println("Enter the miles to convert it to km : ");
		double miles = sc.nextDouble();
		System.out.println("Enter the meters to convert it to feet : ");
		double meters = sc.nextDouble();
		System.out.println("Enter the feet to convert it to meters : ");
		double feet = sc.nextDouble();
		sc.close();
		System.out.println(km +" km to miles: " + convertKmToMiles(10));
		System.out.println(miles + " miles to km: " + convertMilesToKm(6.2));
		System.out.println(meters + " meters to feet: " + convertMetersToFeet(5));
		System.out.println(feet +" feet to meters: " + convertFeetToMeters(16.4));
	}
}
