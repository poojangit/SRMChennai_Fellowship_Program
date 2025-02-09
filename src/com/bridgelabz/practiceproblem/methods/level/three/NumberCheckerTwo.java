package com.bridgelabz.practiceproblem.methods.level.three;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerTwo {

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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int num) {
        int[] digits = storeInDigitsArray(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find the frequency of each digit in the number without using maps
    public static int[][] digitFrequency(int num) {
        int[] digits = storeInDigitsArray(num);
        int[][] frequencyArray = new int[10][2]; // Array to store digit (0-9) and its frequency

        // Initialize the frequency array
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i;
            frequencyArray[i][1] = 0;
        }

        // Count frequencies
        for (int digit : digits) {
            frequencyArray[digit][1]++;
        }

        // Filter out unused digits
        int count = 0;
        for (int[] freq : frequencyArray) {
            if (freq[1] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for (int[] freq : frequencyArray) {
            if (freq[1] > 0) {
                result[index][0] = freq[0];
                result[index][1] = freq[1];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Count of digits: " + countTheDigits(number));

        int[] digits = storeInDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        int[][] frequencyArray = digitFrequency(number);
        System.out.println("Digit frequencies: ");
        for (int[] freq : frequencyArray) {
            System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
        }

        sc.close();
    }
}