package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class SubstringOccurrences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the main string: ");
		String mainStr = scanner.nextLine();

		System.out.print("Enter the substring to search: ");
		String subStr = scanner.nextLine();

		int count = 0;
		int index = mainStr.indexOf(subStr);

		// Count occurrences by searching substrings
		while (index != -1) {
			count++;
			index = mainStr.indexOf(subStr, index + subStr.length());
		}

		System.out.println("Occurrences of substring: " + count);

		scanner.close();
	}
}
