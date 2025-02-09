package com.bridgelabz.practiceproblem.methods.level.three;
import java.util.Scanner;

public class CalendarDisplay {

    // Array storing the names of the months
    private static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    // Array storing the number of days in each month (non-leap year)
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month using Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int year, int month) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year) {
        // Print the month and year header
        System.out.println("\n  " + MONTHS[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Adjust days for leap year if February
        int daysInMonth = DAYS_IN_MONTH[month - 1];
        if (month == 2 && isLeapYear(year)) {
            daysInMonth = 29;
        }

        // Get the starting day of the month
        int firstDay = getFirstDayOfMonth(year, month);

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get month and year input from user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input. Please enter a valid month (1-12) and year.");
        } else {
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
