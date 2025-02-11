package com.bridgelabz.controlflow.leveltwo;

//todo : Create a program to find the power of a number.
//! Hint => 
//! Get integer input for two variables named number and power.
//! Create a result variable with an initial value of 1.
//! Run a for loop from i = 1 to i <= power.
//! In each iteration of the loop, multiply the result with the number and assign the value to the result.
//! Finally, print the result

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Enter a power: ");
		int power = sc.nextInt();
		int result = 1;
		for(int i=1; i<=power; i++){
			result *= num;
		}
		System.out.println(num + " with Power of " + power + " is " +result);
		sc.close();
	}
}

