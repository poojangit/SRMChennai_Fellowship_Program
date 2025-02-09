package com.bridgelabz.practiceproblem.methods.level.two;

import java.util.Scanner;

public class SumOfNaturalNumbersUsingRecursive {
	public static int sumUsingFormula(int number) {
		return number * (number+1 )/2;
	}
	public static int sumUsingRecursion(int n) {
		if(n==1) {
			return 1;
		}
		return n+ sumUsingRecursion(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take the user input number
		System.out.println("Enter the Natural number : ");
		int number = sc.nextInt();
		//  check whether it's a Natural number, if not exit
		sc.close();
		if(number > 0) {
			System.out.println("You have entered a natural number");
		}
		else {
			return;
		}
		int recursiveSum = sumUsingRecursion(number);
		int formulaSum = sumUsingFormula(number);
		System.out.println("The sum of natural number using recursive is : " + recursiveSum);
		System.out.println("The sum of natural number using formula is " + formulaSum);
		if(recursiveSum == formulaSum) {
			System.out.println("Both the methods produce same result");
		}
		else {
			System.out.println("Different result");
		}
		sc.close();
	}

}
