package com.bridgelabz.classandobjects.leveltwo;

import java.util.Scanner;

public class PalindromeChecker {
	// declare the text attributes
	private String text;

	// initialize the variables using constructors
	public PalindromeChecker(String text) {
		this.text = text;
	}
	// method to check if it is a palindrome string or not using a boolean return type
	public boolean isPalindrome() {
		//	convert all the letters to lowercase
		String cleanedText = text.toLowerCase();
		System.out.println(cleanedText);
		int length = cleanedText.length();
		for(int i=0; i< length/2; i++) {
			// check if the first character and last character after a strings are equal or not
			if(cleanedText.charAt(i) != cleanedText.charAt(length-i-1)) {
				return false;
			}
		}
		return true;
	}
	// method to display if the given string is palindrome or not
	public void displayResult() {
		if(isPalindrome()) {
			System.out.println("\"" + text + "\" is a Palindrome String" );
		} else {
			System.out.println("\"" + text + "\" is not a Palindrome String");
		}
	}
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String text = sc.nextLine();
		//	creating a object for palindromechecker class
		PalindromeChecker paliCheck = new PalindromeChecker(text);
		paliCheck.isPalindrome();
		paliCheck.displayResult();
		sc.close();
	}
}
