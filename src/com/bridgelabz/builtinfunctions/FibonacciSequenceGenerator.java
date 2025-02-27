package com.bridgelabz.builtinfunctions;

//Fibonacci Sequence Generator: 
//○ Write a program that generates the Fibonacci sequence up to a specified number of terms entered by the user. 
//○ Organize the code by creating a function that calculates and prints the Fibonacci sequence. 

import java.util.Scanner;

public class FibonacciSequenceGenerator {
	public static void generateFibonacci(int terms) {
		int first = 0, second = 1;
		System.out.println("Fibonacci sequence up to " + terms + " terms: ");
		for(int i=1; i<= terms; i++) {
			System.out.println(first + " ");
			int next = first + second; //calculate next term
			first = second; //shift first to second
			second = next; //shift second to next term
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	taking user input 
		System.out.println("Enter the number of terms: ");
		int terms = sc.nextInt();
		//	condition is that the input should be positive number
		if(terms <=0) {
			System.out.println("Please enter a positive number: ");
		} else {
			generateFibonacci(terms);
		}
		sc.close();
	}

}
