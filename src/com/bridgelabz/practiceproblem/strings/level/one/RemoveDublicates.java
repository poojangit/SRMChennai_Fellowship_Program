package com.bridgelabz.practiceproblem.strings.level.one;

import java.util.Scanner;

public class RemoveDublicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String result = "";

		// Check and add characters if not already in the result
		for (char ch : input.toCharArray()) {
			if (result.indexOf(ch) == -1) {
				result += ch;
			}
		}

		System.out.println("Modified String without duplicates: " + result);

		scanner.close();
	}
}
