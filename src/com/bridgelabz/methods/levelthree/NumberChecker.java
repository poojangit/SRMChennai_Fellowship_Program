package com.bridgelabz.methods.levelthree;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {
	// method to find the count of the number
	public static int countTheDigits(int num) {
		int count = 0;
		while(num!=0) {
			num /= 10;
			count ++;
		}
		return count;
	}
	// method to store the digits in the array
	public static int[] storeInDigitsArray(int num) {
		int count = countTheDigits(num);
		int[] digits = new int[count];
		for(int i=count-1; i >= 0; i--) {
			digits[i] = num%10;
			num /= 10;
		}
		return digits;
	}
	// methods to check if the number is duck number
	public static boolean isDuckNumber(int num) {
		if(num == 0) {
			return false;
		}
		while(num != 0) {
			if(num %10 == 0) 
				return true;
			num /=10;
		}
		return false;
	}
	// method to find if the number is arm strong number
	public static boolean isArmStrong(int num) {
		int[] digits = storeInDigitsArray(num);
		int power = digits.length;
		int sum = 0;
		for(int digit : digits) {
			sum += Math.pow(digit, power);
		}
		return sum == num;
	}
	// method to find the first and second largest element
	public static int[] findLargestAndSecondLargestElement(int num) {
		int[] digits = storeInDigitsArray(num);
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int digit : digits) {
			if (digit > largest) {
				secondLargest = largest;
				largest = digit;
			} else if (digit > secondLargest && digit != largest) {
				secondLargest = digit;
			}
		}
		return new int[]{largest, secondLargest};
	}
	// method to find the first and second smallest element 
	public static int[] findSmallestAndSecondSmallestElement(int num) {
		// create a int array as digits to store the digits
		int[] digits = storeInDigitsArray(num);
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int digit : digits) {
			if (digit < smallest) {
				secondSmallest = smallest;
				smallest = digit;
			} else if (digit < secondSmallest && digit != smallest) {
				secondSmallest = digit;
			}
		}
		return new int[]{smallest, secondSmallest};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		//	display the results
		System.out.println("Count of digits: " + countTheDigits(number));
		System.out.println("Digits array: " + Arrays.toString(storeInDigitsArray(number)));
		System.out.println("Is Duck Number: " + isDuckNumber(number));
		System.out.println("Is Armstrong Number: " + isArmStrong(number));

		int[] largestTwo = findLargestAndSecondLargestElement(number);
		System.out.println("Largest: " + largestTwo[0] + ", Second Largest: " + largestTwo[1]);

		int[] smallestTwo = findSmallestAndSecondSmallestElement(number);
		System.out.println("Smallest: " + smallestTwo[0] + ", Second Smallest: " + smallestTwo[1]);

		sc.close();
	}
}
