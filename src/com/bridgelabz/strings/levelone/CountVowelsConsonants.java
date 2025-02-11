package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class CountVowelsConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input for the string
		System.out.print("Enter a string: ");
		String input = scanner.nextLine().toLowerCase();

		int vowels = 0, consonants = 0;

		// Check each character
		for (char ch : input.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') { // Ignore non-alphabet characters
				if ("aeiou".indexOf(ch) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

		scanner.close();
	}
}
