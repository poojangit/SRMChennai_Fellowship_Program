package com.bridgelabz.builtinfunctions;

import java.util.Scanner;

public class GCD_LCM_Calculator {
	// Function to calculate GCD using the Euclidean algorithm
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	// function to calculate lcm using the fomula 
	public static int lcm(int a , int b) {
		return (a*b)/gcd(a,b);
	}
	// function to take user input
	public static int[] getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		sc.close();
		return new int[] {num1, num2};
	}
	// function to display the results
	public static void displayResults(int num1, int num2, int gcdResult, int lcmResult) {
		System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcdResult);
		System.out.println("LCM of " + num1 + " and " + num2 + " is : " + lcmResult);
	}
	//main function
	public static void main(String[] args) {
		int[] numbers = getUserInput();
		int num1 = numbers[0];
		int num2 = numbers[1];
		int gcdResult = gcd(num1, num2);
		int lcmResult = lcm(num1, num2);
		displayResults(num1, num2, gcdResult, lcmResult);
	}
}
