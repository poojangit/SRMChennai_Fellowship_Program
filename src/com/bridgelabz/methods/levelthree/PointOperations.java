package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class PointOperations {

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double distanceSquared = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        return Math.sqrt(distanceSquared);
    }

    // Method to find the slope and y-intercept of a line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // result[0] is slope (m), result[1] is y-intercept (b)

        // Check if the line is vertical to avoid division by zero
        if (x1 == x2) {
            throw new ArithmeticException("Slope is undefined for a vertical line.");
        }

        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept (b)
        double yIntercept = y1 - slope * x1;

        result[0] = slope;
        result[1] = yIntercept;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for two points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculate and display the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance between points: %.4f\n", distance);

        try {
            // Calculate and display the equation of the line
            double[] lineEquation = findLineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of the line: y = %.4fx + %.4f\n", lineEquation[0], lineEquation[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
