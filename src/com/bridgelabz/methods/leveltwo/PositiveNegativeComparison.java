package com.bridgelabz.methods.leveltwo;

//Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
//Hint => 
//Write a Method to Check whether the number is positive or negative
//Write a Method to check whether the number is even or odd
//Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
//In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
//If the number is negative, print negative. 
//Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
import java.util.Scanner;

public class PositiveNegativeComparison {
    // Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers and return comparison result
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking each number for positivity/negativity and even/odd
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is positive and ");
                if (isEven(number)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println(number + " is negative.");
            }
        }

        // Comparing the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparison of first and last element: ");
        if (comparisonResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("The first and last elements are equal.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        scanner.close();
    }
}
