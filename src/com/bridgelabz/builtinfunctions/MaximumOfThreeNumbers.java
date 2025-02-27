package com.bridgelabz.builtinfunctions;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
	public static int getInput(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		return sc.nextInt();
	}
	public static int findMax(int num1 , int num2, int num3) {
		return Math.max(num1, Math.max(num2, num3));
	}
	public static void main(String[] args) {
		System.out.println("Enter three numbers to find the maximum: ");
		//	taking inputs
		int num1 = getInput("Enter first number : ");
		int num2 = getInput("Enter second number: ");
		int num3 = getInput("Enter third number : ");

		//	finding maximum
		int max = findMax(num1, num2, num3);
		//	displaying the results
		System.out.println("The maximum number is : " + max);
	}

}
