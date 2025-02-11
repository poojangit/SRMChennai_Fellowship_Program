package com.bridgelabz.strings.levelone;

import java.util.Scanner;

//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
//Hint =>
//
//Take user input using the  Scanner next() method for 2 String variables
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String Built-In method to check if the results are the same and display the result
public class ComparisionOfTwoStrings {
	// Method to compare two strings using charAt()
	public static boolean compareStringUsingCharAt(String str1, String str2) {
		// If lengths differ, strings cannot be equal
		if(str1.length() != str2.length()) {
			return false;
		}
		// Compare characters one by one
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Taking input for the two strings
		System.out.println("Enter the two strings : ");
		String str1 = sc.next();
		String str2 = sc.next();
		// Compare using custom method
		boolean charComparisionResult = compareStringUsingCharAt(str1, str2);
		// Compare using built-in equals() method
		boolean builtInComparision = str1.equals(str2);
		// Display the results
		System.out.println("Comparision using charAt() method : " + charComparisionResult);
		System.out.println("Comparision using equals() method : " + builtInComparision);
		// Verify if both results match
		if(charComparisionResult == builtInComparision) {
			System.out.println("Results are same");
		} else {
			System.out.println("Different result");
		}
		sc.close();
	}

}
