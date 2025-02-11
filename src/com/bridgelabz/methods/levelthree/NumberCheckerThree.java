package com.bridgelabz.methods.levelthree;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerThree {

    // Method to find the count of digits in the number
    public static int countTheDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeInDigitsArray(int num) {
        int count = countTheDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
// store the revered
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) return false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int num) {
        int[] digits = storeInDigitsArray(num);
        int[] reversedDigits = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int num) {
        if (num == 0) return false;
        int[] digits = storeInDigitsArray(num);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Count of digits: " + countTheDigits(number));

        int[] digits = storeInDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        System.out.println("Are the original and reversed arrays equal? " + areArraysEqual(digits, reversedDigits));
        System.out.println("Is Palindrome: " + isPalindrome(number));

        System.out.println("Is Duck Number: " + isDuckNumber(number));

        sc.close();
    }
}
