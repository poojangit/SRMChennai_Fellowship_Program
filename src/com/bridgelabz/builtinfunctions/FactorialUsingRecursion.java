package com.bridgelabz.builtinfunctions;
//Factorial Using Recursion: 
//○ Write a program that calculates the factorial of a number using a recursive function. 
//○ Include modular code to separate input, calculation, and output processes. 

import java.util.Scanner;

//  recursive function to calculate factorial
public class FactorialUsingRecursion {
	public static long factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n* factorial(n-1);
	}
	// function to take the user input
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		return num;
	}
	// Function to display the result
	public static void displayResult(int num ,long result) {
		System.out.println("Factorial of " + num + " is " + result ) ;
	}
	// Main function
	public static void main(String[] args) {
		int num = getUserInput();
		long result = factorial(num);
		displayResult(num, result);
	}

}
