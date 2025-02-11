package com.bridgelabz.methods.levelone;
//Write a program to check whether a number is positive, negative, or zero.
//Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

import java.util.Scanner;

public class PositiveNegativeZero {
	// define a method for finding the positive,negative,zero 
	public static int checkPositiveNegative(int number) {
		if(number < 0) {
			return -1;
		}
		else if(number > 0){
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take a input from the user to get the number 
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("The entered number is ");
		// check condition if the number is positive , negative, zero
		if (checkPositiveNegative(number)==0) {
			System.out.println("Zero");
		}
		else if(checkPositiveNegative(number) == 1){
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}

		sc.close();
	}
}

