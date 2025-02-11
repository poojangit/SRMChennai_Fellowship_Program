package com.bridgelabz.practiceproblem.strings.level.one;

import java.util.Scanner;

public class LexicographicalComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();

		// Manual comparison without using compareTo()
		int comparison = 0;
		int minLength = Math.min(str1.length(), str2.length());

		for (int i = 0; i < minLength; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				comparison = str1.charAt(i) - str2.charAt(i);
				break;
			}
		}

		if (comparison == 0 && str1.length() != str2.length()) {
			comparison = str1.length() - str2.length();
		}

		if (comparison < 0) {
			System.out.println(str1 + " comes before " + str2 + " in lexicographical order.");
		} else if (comparison > 0) {
			System.out.println(str2 + " comes before " + str1 + " in lexicographical order.");
		} else {
			System.out.println("Both strings are equal.");
		}

		scanner.close();
	}
}
