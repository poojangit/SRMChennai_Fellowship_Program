package com.bridgelabz.builtinfunctions;

import java.util.Scanner;

public class PrimeNumberChecker {
	 // Function to check if a number is prime
    public static boolean isPrimeCheck(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // Number is prime
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if(isPrimeCheck(num)) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
		sc.close();
	}

}
