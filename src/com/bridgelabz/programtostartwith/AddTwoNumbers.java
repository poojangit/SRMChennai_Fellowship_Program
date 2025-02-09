package com.bridgelabz.programtostartwith;

import java.util.Scanner;

//2. Add Two Numbers
//Write a program that takes two numbers as input from the user and prints
//their sum.

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 // Take the input from the users
	        System.out.println("Enter any two numbers: ");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();
	        int sum = num1 + num2;
	        System.out.println("Sum of two numbers : " + sum);
	        sc.close();

	}

}
