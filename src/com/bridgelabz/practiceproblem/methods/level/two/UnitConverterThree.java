package com.bridgelabz.practiceproblem.methods.level.two;

import java.util.Scanner;

public class UnitConverterThree {
	// Initialized the constants
	public static final double FARHENHEIT_TO_CELSIUS = 5/9;
	public static final double CELSIUS_TO_FARHENHEIT = 35;
	public static final double POUNDS_TO_KILOGRAMS = 0.453592;
	public static final double KILOGRAM_TO_POUNDS = 2.20462;
	// methods to convert from farhenheit to celcius
	public static double convertFarhenheitToCelsius(double farhenheit) {
		return (farhenheit-32)*FARHENHEIT_TO_CELSIUS;
	}
	// method to convert celsius to farhenheit
	public static double convertCelsiustoFarheit(double celsius) {
		return (celsius* 9/5)+ CELSIUS_TO_FARHENHEIT;
	}
	// method to convert from pounds to kilogram
	public static double convertPoundsToKilograms(double pounds) {
		return pounds*POUNDS_TO_KILOGRAMS;
	}
	// methods to convert from kilograms to pounds
	public static double convertKilogramsToPounds(double kilograms) {
		return kilograms*KILOGRAM_TO_POUNDS;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take the user input 
		System.out.println("Enter a measurement in farhenheit for converting it to celsius: ");
		double farhenheit = sc.nextDouble();
		System.out.println("Enter a measurement in celsius to convert it to farhenheit: ");
		double celcius = sc.nextDouble();
		System.out.println("Enter a measurement in pounds to convert it to kilograms : ");
		double pounds = sc.nextDouble();
		System.out.println("Enter a measurement in kilograms to convert it to pounds : ");
		double kilograms = sc.nextDouble();
		// displaying the result 
		System.out.println( farhenheit+ " farhenheit is converted to " + convertFarhenheitToCelsius(farhenheit) + " degree celcius");
		System.out.println( celcius + " celcius is converted to " + convertCelsiustoFarheit(kilograms) + " degree farhenheit");
		System.out.println( pounds + " pounds is converted to " + convertPoundsToKilograms(pounds) + " kilograms");
		System.out.println( kilograms + " kilogram is converted to " + convertKilogramsToPounds(kilograms) + " pounds");
		sc.close();
	}

}
