package com.bridgelabz.practiceproblem.strings.level.one;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = scanner.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = scanner.nextLine();

		if (areAnagrams(str1, str2)) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}

		scanner.close();
	}

	// Method to check if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();

		// Sort both character arrays
		Arrays.sort(array1);
		Arrays.sort(array2);

		// Compare the sorted arrays
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
}
