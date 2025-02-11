package com.bridgelabz.methods.levelone;
//Create a program to find the maximum number of handshakes among N number of students.
//Hint => 
//Get integer input for number of students
//Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
//Write a method to use the combination formulae to calculate the number of handshakes

import java.util.Scanner;

public class NumberOfHandShakes {
	// define a method to calculate a possibleHandShake
	public static int possibleHandshakes(int students){
		// formula for calculating the maximum number of hand shakes
		int maxOfHandshakes = (students*(students-1)/2);
		return maxOfHandshakes;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		// take the user value for entering a number of students
		System.out.println("Enter the Number of students : ");
		int numOfStudents = sc.nextInt();
		System.out.println("The maximum number of possible handshakes are : " + possibleHandshakes(numOfStudents));
		sc.close();
	}
}

