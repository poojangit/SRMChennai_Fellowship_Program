package com.bridgelabz.practiceproblem.strings.level.one;

import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		StringBuilder toggledStr = new StringBuilder();

		// Toggle case of each character
		for (char ch : input.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				toggledStr.append(Character.toLowerCase(ch));
			} else {
				toggledStr.append(Character.toUpperCase(ch));
			}
		}

		System.out.println("Toggled case string: " + toggledStr);

		scanner.close();
	}
}
