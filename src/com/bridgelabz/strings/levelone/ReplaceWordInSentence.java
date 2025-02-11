package com.bridgelabz.strings.levelone;

import java.util.Scanner;

public class ReplaceWordInSentence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();

		System.out.print("Enter the word to replace: ");
		String targetWord = scanner.next();

		System.out.print("Enter the replacement word: ");
		String replacementWord = scanner.next();

		// Perform the word replacement manually
		String modifiedSentence = replaceWord(sentence, targetWord, replacementWord);

		System.out.println("Modified Sentence: " + modifiedSentence);

		scanner.close();
	}

	// Method to manually replace a word
	public static String replaceWord(String sentence, String target, String replacement) {
		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) {
				result.append(replacement);
			} else {
				result.append(words[i]);
			}
			if (i < words.length - 1) {
				result.append(" ");
			}
		}

		return result.toString();
	}
}
