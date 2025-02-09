package com.bridgelabz.practiceproblem.methods.level.three;

import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate random salaries and years of service
    public static double[][] generateEmployeeData(int employeeCount) {
        Random random = new Random();
        double[][] employeeData = new double[employeeCount][2];

        for (int i = 0; i < employeeCount; i++) {
            // Generate 5-digit random salary (between 10000 and 99999)
            double salary = 10000 + random.nextInt(90000);
            // Generate random years of service between 1 and 15
            double yearsOfService = 1 + random.nextInt(15);

            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaries(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonusPercentage = yearsOfService > 5 ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }

        return updatedData;
    }

    // Method to calculate and display salary and bonus statistics
    public static void displayBonusSummary(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee Data Summary:\n");
        System.out.printf("%10s %15s %15s %15s\n", "Employee", "Old Salary", "New Salary", "Bonus");

        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%10d %15.2f %15.2f %15.2f\n", (i + 1), oldSalary, newSalary, bonus);
        }

        System.out.println("\nSummary:\n");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;

        // Generate random employee data
        double[][] employeeData = generateEmployeeData(EMPLOYEE_COUNT);

        // Calculate new salaries and bonuses
        double[][] updatedData = calculateNewSalaries(employeeData);

        // Display bonus summary
        displayBonusSummary(updatedData);
    }
}
