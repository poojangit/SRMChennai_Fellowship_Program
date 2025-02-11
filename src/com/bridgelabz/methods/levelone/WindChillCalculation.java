package com.bridgelabz.methods.levelone;

import java.util.Scanner;

//Write a program calculate the wind chill temperature given the temperature and wind speed
//Hint => 
//Write a method to calculate the wind chill temperature using the formula 
//windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
//public double calculateWindChill(double temperature, double windSpeed)

public class WindChillCalculation {
	//method to calculate the windChill
	public double calculateWindChill(double temperature, double windSpeed) {
		// mathematical operation for finding windchill using temp and windspeed
		double windChill = 35.75 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creating a object to access a non static method
		WindChillCalculation windChillObj = new WindChillCalculation();
		// take the input from the user for temp in degree celcius
		System.out.println("Enter the temperature in celcius : ");
		double temperature = sc.nextDouble();
		// take the input from the user for windspeed 
		System.out.println("Enter the windSpeed : ");
		double windSpeed = sc.nextDouble();
		System.out.println("The Wind Chill is : " + windChillObj.calculateWindChill(temperature, windSpeed));

		sc.close();
	}
}
