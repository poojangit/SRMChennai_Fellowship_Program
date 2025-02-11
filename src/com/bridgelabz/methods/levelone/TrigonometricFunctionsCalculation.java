package com.bridgelabz.methods.levelone;

import java.util.Scanner;

//Write a program to calculate various trigonometric functions using Math class given an angle in degrees
//Hint => 
//Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
//public double[] calculateTrigonometricFunctions(double angle)

public class TrigonometricFunctionsCalculation {
	// Method to calculate sine, cosine, and tangent
	public double[] calculateTrigometricFunctions(double angle) {
		// Convert the angle to radians
		double radians = Math.toRadians(angle);
		// Calculate the trigonometric functions
		double sine = Math.sin(radians);
		double cosine = Math.cos(radians);
		double tangent = Math.tan(radians);

		// Return results in an array
		return new double[]{sine, cosine, tangent};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TrigonometricFunctionsCalculation calculator = new TrigonometricFunctionsCalculation();
		System.out.println("Enter the angle in degree: ");
		double angle = sc.nextDouble();
		// Calculate and display the trigonometric values
		double[] results = calculator.calculateTrigometricFunctions(angle);
		System.out.print("Sine of " +  angle + " is " + results[0]);
		System.out.print("\nCosine of " +  angle + " is " + results[1]);
		System.out.print("\nTangent of " +  angle + " is " + results[2]);
		sc.close();
	}
}
