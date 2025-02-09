package com.bridgelabz.practiceproblem.methods.level.one;

//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
//Hint => 
//Simple Interest = Principal * Rate * Time / 100
//Take user input for principal, rate, time
//Write a method to calculate the simple interest given principle, rate and time as parameters
//Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

import java.util.Scanner;

public class SimpleInterest {
	// define a method to calculate a simple interest 
	public static double simpleInterest(double principal, double rate, double time) {
		// formula for finding the simple interest value
		double simpleInterestValue = principal * rate * time / 100;
		return simpleInterestValue;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		// take the principal amount from the user
		System.out.println("\nEnter a Principal amount: ");
		double principal = sc.nextInt();
		//  user input for taking the rate
		System.out.println("Enter the rate : ");
		double rate = sc.nextInt();
		//  user input for taking the time
		System.out.println("Enter the time : ");
		double time = sc.nextInt();
		System.out.println("The simple interest is : " + simpleInterest(principal, rate, time));
		sc.close();

	}

}
