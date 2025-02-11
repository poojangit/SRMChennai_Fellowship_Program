package com.bridgelabz.methods.leveltwo;

import java.util.Scanner;

public class LeapYearCheck {
	// method to check if it is a leap year or not return type is boolean
	public static boolean isLeapYear(int year) {
		// logic for checking
		if(year%400 == 0  || year%100 != 0 && year%4 ==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take the year input from the user
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		sc.close();
		// if the year is greater than 1582 then only apply the logic
		if(year >= 1582) {
			// call the method if the condition is true
			if(isLeapYear(year)) {
				System.out.println("It is a leap year");
			} 
			else {
				System.out.println("Not a leap year");
			}
		}
		else {
			System.out.println("Please enter a valid year! year should be greater than 1582");
		}
	}

}
