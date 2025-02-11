package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

//Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
//Hint => 
//Take the input for a number
//Write a static Method to find the factors of the number and save them in an array and return the array. 
//To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
//Write a method to find the sum of the factors using factors array
//Write a method to find the product of the factors using factors array
//Write a method to find the sum of square of the factors using Math.pow() method

class FactorsOfaNumber{
	// define a method to findTheFacto_rs
	public static int[] findTheFactors(int number) {
		int count = 0;

		// first loop to count the factors
		for(int i=1; i<= number ; i++) {
			if(number %i == 0) {
				count++;
			}
		}
		int[] factors = new int[count];
		int index = 0;

		// second loop to store factors in the array
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				factors[index++] = i;
			}
		}
		return factors;
	}
	// method to calculate the sum of factors
	public static int calculateSum(int[] factors) {
		int sum = 0;
		for(int factor : factors) {
			sum += factor;
		}
		return sum;
	}
	// method to calculate the product of factors
	public static int calculateProduct(int[] factors) {
		int product = 1;
		for(int factor : factors) {
			product *= factor;
		}
		return product;
	}

	// method to calculate the sum then squares of factors 
	public static int calculateSumOfSquares(int[] factors) {
		int sum = 0;
		for(int factor : factors) {
			sum += Math.pow(factor, 2);
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// taking the user input
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		System.out.println("The factors of " + number + " is : ");
		int[] factors = findTheFactors(number);
		// display the factors
		for(int factor : factors) {
			System.out.println(factor + " ");
		}
		//	display the sum of factors
		System.out.println("Sum of the factors : " + calculateSum(factors));
		//	display the product of factors
		System.out.println("Product of the factors : " + calculateProduct(factors));
		//	display the sum of square of notes
		System.out.println("Sum of square of factors : " + calculateSumOfSquares(factors));
		System.out.println();
		sc.close();
	}
}
