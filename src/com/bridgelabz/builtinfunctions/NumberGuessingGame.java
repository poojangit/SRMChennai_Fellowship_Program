package com.bridgelabz.builtinfunctions;

import java.util.Random;
import java.util.Scanner;

//Number Guessing Game: 
//○ Write a Java program where the user thinks of a number between 1 and 100, and the computer tries to guess the number by generating random guesses. 
//○ The user provides feedback by indicating whether the guess is high, low, or correct. The program should be modular, with different functions for generating guesses, receiving user feedback, and determining the next guess. 
public class NumberGuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// create a random object
		Random random = new Random();
		System.out.println("Think of a number between 1 and 100 , and i will try to guess it!");
		int low = 1 , high = 100, guess;
		boolean correctGuess = false;
		// loop till the user entered correct guess
		while(!correctGuess) {
			guess = low + random.nextInt(high-low+1);
			System.out.println("Is your number " + guess + " ? (Enter 'h' for high, 'l' for low , 'c' for correct");
			char feedback = sc.next().charAt(0);
			//	condition for check if the user entered high low or correct
			if(feedback=='h') {
				high = guess - 1;
			} else if(feedback == 'l') {
				low = guess+1;
			} else if(feedback == 'c') {
				System.out.println("Yes ! I guessed your number correctly " + guess);
			} else {
				System.out.println("Invalid input! ");
			}
		}
	}
}
