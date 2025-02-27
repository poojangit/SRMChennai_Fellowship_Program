package com.bridgelabz.builtinfunctions;

import java.util.Scanner;

public class PalindromeChecker {

	// function to check if a string is a palindrome
	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		int left = 0, right = str.length()-1;

		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}
	// Function to take user input
	public static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		sc.close();
		return input;
	}
	// main function to execute the program
	public static void main(String[] args) {
		String input = getUserInput();
		if(isPalindrome(input)) {
			System.out.println("\"" + input + "\" is a Palindrome. ");
		} else {
			System.out.println("\"" + input + "\" is NOT a palindrome");
		}
	}

}
