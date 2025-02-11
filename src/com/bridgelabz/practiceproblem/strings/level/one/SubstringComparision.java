package com.bridgelabz.practiceproblem.strings.level.one;

import java.util.Scanner;

//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//Hint =>
//
//Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
public class SubstringComparision {
	// Method to create substring using charAt()
	public static String createSubstringUsingCharAt(String text, int start, int end) {
		StringBuilder result = new StringBuilder();
		for (int i = start; i < end; i++) {
			result.append(text.charAt(i));
		}
		return result.toString();
	}

	// Method to compare two strings using charAt()
	public static boolean compareStringsUsingCharAt(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take user input for the string and indices
		System.out.print("Enter the string: ");
		String text = sc.next();

		System.out.print("Enter the starting index: ");
		int start = sc.nextInt();

		System.out.print("Enter the ending index: ");
		int end = sc.nextInt();
		// Validate the input indices
		if (start < 0 || end > text.length() || start >= end) {
			System.out.println("Invalid indices. Please enter valid start and end indices.");
			return;
		}
		// Substring using custom method
		String customSubstring = createSubstringUsingCharAt(text, start, end);

		// Substring using built-in method
		String builtInSubstring = text.substring(start, end);

		// Compare substrings using custom comparison method
		boolean areEqual = compareStringsUsingCharAt(customSubstring, builtInSubstring);

		// Display results
		System.out.println("Substring using charAt(): " + customSubstring);
		System.out.println("Substring using substring(): " + builtInSubstring);
		System.out.println("Are the substrings equal? " + areEqual);
		sc.close();
	}
}
