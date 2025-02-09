package com.bridgelabz.practiceproblem.methods.level.two;

import java.util.Scanner;

//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
//public static double convertYardsToFeet(double yards) => 
//Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
//Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
//Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
//Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
//Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;

public class UnitConverterTwo {
	public static final double YARDS_TO_FEET = 3;
	public static final double FEET_TO_YARDS = 0.333333;
	public static final double METERS_TO_INCHES = 39.3701;
	public static final double INCHES_TO_METERS = 0.0254;
	public static final double INCHES_TO_CM = 2.54;

	// converts yards to feet
	public static double convertYardsToFeet(double yards) {
		return yards*YARDS_TO_FEET;	 
	}

	// converts feet to yards
	public static double convertFeetToYards(double feet) {
		return feet*FEET_TO_YARDS;	
	}
	// converts meters to inches
	public static double convertMetersToInches(double meters) {
		return meters*METERS_TO_INCHES;
	}
	// converts inches to meters
	public static double convertInchesToMeters(double inches) {
		return inches*INCHES_TO_METERS;
	}
	// converts inches to cm
	public static double convertInchesToCm(double inches) {
		return inches*INCHES_TO_CM;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input for taking yards from users
		System.out.println("Enter a measurement in yards to convert it to feet");
		double yards = sc.nextDouble();
		// input for taking feet from users
		System.out.println("Enter a measurement in feet to convert it to yards");
		double feet = sc.nextDouble();
		// input for taking meters from users
		System.out.println("Enter a measurement in meters to convert it to inches");
		double meters = sc.nextDouble();
		// input for taking inches from users
		System.out.println("Enter a measurement in inches to convert it to meters");
		double inchesToMeter = sc.nextDouble();
		// input for taking inches from users
		System.out.println("Enter a measurement in inches to convert it to cm");
		double inchesToCm = sc.nextDouble();
		System.out.println(yards + " yards to feet : " + convertYardsToFeet(yards));
		System.out.println(feet + " feet to yards : " + convertFeetToYards(feet));
		System.out.println(meters + " meters to inches : " + convertMetersToInches(meters));
		System.out.println(inchesToMeter + " inches to meters : " + convertInchesToMeters(inchesToCm));
		System.out.println(inchesToCm + " inches to cm : " + convertInchesToCm(inchesToCm));
		sc.close();
	}

}
