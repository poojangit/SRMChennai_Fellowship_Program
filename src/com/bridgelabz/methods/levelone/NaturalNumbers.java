package com.bridgelabz.methods.levelone;

//Write a program to find the sum of n natural numbers using loop
//Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 

import java.util.Scanner;

public class NaturalNumbers {
	// method to find the sum of natural number
	public static int sumOfNaturalNum(int size){

		return size *(size+1)/2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take the user value till which you need to sum up the numbers
		System.out.println("\nEnter the number upto which you want to sum: ");
		int size = sc.nextInt();
		// condition for checking with user entered negative number or not
		if(size <0){
			System.out.println("Enter the positive integer");
		} else{
			System.out.println("The sum of the first " + size + " natural numbers " + sumOfNaturalNum(size));
		}
		sc.close();

	}
}
