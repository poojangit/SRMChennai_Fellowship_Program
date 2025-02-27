package com.bridgelabz.builtinfunctions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Problem 4: Date Comparison Write a program that: 
//➢ Takes two date inputs and compares them to check if the first date is before, after, or the same as the second date. 
//Hint: Use isBefore(), isAfter(), and isEqual() methods from the LocalDate class.

public class DateComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	Define the date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//	take first date from the user
		System.out.println("Enter the first date (yyyy-MM-dd):");
		String firstDateInput = sc.nextLine();
		LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
		//	take second date from the user
		System.out.println("Enter the second date (yyyy-MM-dd)");
		String secondDateInput = sc.nextLine();
		LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);
		//	compare
		if(firstDate.isBefore(secondDate)) {
			System.out.println("The first date is before the second date");
		} else if(firstDate.isAfter(secondDate)) {
			System.out.println("The first date is after the second date");
		} else if(firstDate.isEqual(secondDate)) {
			System.out.println("Both the dates are same");
		}
	}

}
