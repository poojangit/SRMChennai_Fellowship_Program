package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take user input for the string
		System.out.print("Enter a string to reverse: ");
		String input = scanner.nextLine();

		String reversed = "";

		// Append characters from end to the result string
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}

		System.out.println("Reversed String: " + reversed);

		scanner.close();
	}
}
