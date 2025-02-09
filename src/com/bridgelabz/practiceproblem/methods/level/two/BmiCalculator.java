package com.bridgelabz.practiceproblem.methods.level.two;
//An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
//Hint => 
//Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
//Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
//Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 

import java.util.Scanner;

public class BmiCalculator {

    // Method to calculate BMI
    public static double calculateBmi(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100; // Convert cm to meters
        return weight / (heightInMeters * heightInMeters);
    }

    // Method to determine BMI status
    public static String determineBmiStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int persons = scanner.nextInt();
        double[][] personData = new double[persons][3];
        String[] bmiStatuses = new String[persons];

        // Taking user input for weight and height
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter weight in kilograms: ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Enter height in centimeters: ");
            personData[i][1] = scanner.nextDouble();

            // Calculate BMI and determine status
            personData[i][2] = calculateBmi(personData[i][0], personData[i][1]);
            bmiStatuses[i] = determineBmiStatus(personData[i][2]);
        }

        // Displaying the BMI Report
        System.out.println("\nBMI Report\n");
        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.printf("Weight: %.2f kg\n", personData[i][0]);
            System.out.printf("Height: %.2f cm\n", personData[i][1]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + bmiStatuses[i]);
            System.out.println();
        }

        scanner.close();
    }
}
