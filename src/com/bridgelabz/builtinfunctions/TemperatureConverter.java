package com.bridgelabz.builtinfunctions;

import java.util.Scanner;

public class TemperatureConverter {
	// Function to convert Fahrenheit to Celsius
	public static double fahrenheitToCelcius(double fahrenheit) {
		return (fahrenheit-32) *5/9;
	}
	// Function to convert Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius ) {
		return (celsius * 9/5) + 32;
	}
	// Function to take user input and display options
	public static void convertTemperature() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose conversion type: ");
		System.out.println("1. Fahrenheit to celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("Enter your choice(1 or 2): ");

		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Enter the temperature in Fahrenheit: ");
			double fahrenheit = sc.nextDouble();
			double celsius = fahrenheitToCelcius(fahrenheit);
			System.out.println(fahrenheit + " F is equal to " + celsius + " C");
		} else if(choice == 2) {
			System.out.println("Enter temperature in celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = celsiusToFahrenheit(celsius);
			System.out.println(celsius + " C is equal to " + fahrenheit + " F");
		} else {
			System.out.println("Invalid choice ~ Please enter 1 2");
		}
	}
	//	main method
	public static void main(String[] args) {
		convertTemperature();
	}
}
