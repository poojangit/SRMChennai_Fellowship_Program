package com.bridgelabz.practiceproblem.strings.level.one;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		boolean isPalindrome = true;

		// Compare characters from beginning and end
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}

		scanner.close();
	}
}
