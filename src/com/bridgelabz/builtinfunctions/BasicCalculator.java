package com.bridgelabz.builtinfunctions;

import java.util.Scanner;

public class BasicCalculator {
	// Function for addition
    public static double add(double a, double b) {
        return a + b;
    }
    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }
    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }
    // Function for division (handling division by zero)
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN; // Not a Number
        }
        return a / b;
    }
    // Function to display menu and take user input
    public static void performCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();     
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double result = 0;
        boolean validChoice = true;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("Result: " + num1 + " × " + num2 + " = " + result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) { // Check for division by zero
                    System.out.println("Result: " + num1 + " ÷ " + num2 + " = " + result);
                }
                break;
            default:
                validChoice = false;
                System.out.println("Invalid choice! Please select 1, 2, 3, or 4.");
        }
        sc.close();
    }
    // Main method
    public static void main(String[] args) {
        performCalculation();
    }
}
