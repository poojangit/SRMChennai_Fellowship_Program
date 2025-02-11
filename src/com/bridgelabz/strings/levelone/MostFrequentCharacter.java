package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class MostFrequentCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		int[] frequency = new int[256];  // ASCII range
		char mostFrequentChar = '\0';
		int maxFrequency = 0;

		// Count character frequencies
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			frequency[ch]++;
			if (frequency[ch] > maxFrequency) {
				maxFrequency = frequency[ch];
				mostFrequentChar = ch;
			}
		}

		System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
		scanner.close();
	}
}
