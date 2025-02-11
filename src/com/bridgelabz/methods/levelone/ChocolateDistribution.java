package com.bridgelabz.methods.levelone;
//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
//Hint => 
//Get an integer value from user for the numberOfchocolates and numberOfChildren.
//Write the method to find the number of chocolates each child gets and number of remaining chocolates
//public static int[] findRemainderAndQuotient(int number, int divisor) 

import java.util.Scanner;

public class ChocolateDistribution {
	//methods to find the quotient and remainder
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int chocolateForEachChild = number/divisor;
		int remainingChocolate = number%divisor;
		return new int[] {chocolateForEachChild, remainingChocolate};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//take the input from the user for numberOfChocolates
		System.out.println("Enter number of Chocolate :");
		int numberOfCholocates = sc.nextInt();
		//take the input from the user for numberOfChildern
		System.out.println("Enter number of Children : ");
		int numberOfChildren = sc.nextInt();
		int[] result = findRemainderAndQuotient(numberOfCholocates, numberOfChildren);
		System.out.println("Each Child will get " + result[0]);
		//check if no chocolates are remained
		if(result[1]==0) {
			System.out.println("No chocolate remains! Equaly distributed");
		}
		else {
			System.out.println("Remining : " + result[1] + " chocolates");
		}
		sc.close();
	}
}
