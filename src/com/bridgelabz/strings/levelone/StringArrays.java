package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class StringArrays {
	public static void main(String[] args) {
		// Create an array of strings for roll numbers and Name
		String[] rollNumbers = {"001", "002", "003"};
		// Create an array of strings for names and get user input for
		Scanner input = new Scanner(System.in);
		// each name using a for loop
		String[] names = new String[3];
		System.out.println("Enter the name : ");
		for(int index = 0; index<names.length; ++index) {
			names[index] = input.nextLine();
		}
		// access elements of the string array using for each statement
		int i=0;
		for(String name : names) {
			System.out.println("Name : " + name + "\t Roll Number : " + rollNumbers[i++]);
		}

	}
}
