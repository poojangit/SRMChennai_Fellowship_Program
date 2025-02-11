package com.bridgelabz.methods.levelthree;

import java.util.Scanner;

public class CollinearPointsChecker {

    // Method to check collinearity using the slope formula
    public static boolean arePointsCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Check if the slopes of AB, BC, and AC are equal
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    // Method to check collinearity using the area of triangle formula
    public static boolean arePointsCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9; // Using a small threshold for floating-point comparisons
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for three points
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean collinearBySlope = false;
        try {
            collinearBySlope = arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3);
        } catch (ArithmeticException e) {
            System.out.println("Cannot compute slope for vertical or coincident points.");
        }

        // Check collinearity using area formula
        boolean collinearByArea = arePointsCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display results
        System.out.println("Collinear by slope method: " + collinearBySlope);
        System.out.println("Collinear by area method: " + collinearByArea);

        // Check sample points A(2, 4), B(4, 6), C(6, 8)
        System.out.println("Sample points A(2, 4), B(4, 6), C(6, 8):");
        System.out.println("Collinear by slope method: " + arePointsCollinearBySlope(2, 4, 4, 6, 6, 8));
        System.out.println("Collinear by area method: " + arePointsCollinearByArea(2, 4, 4, 6, 6, 8));

        scanner.close();
    }
}
