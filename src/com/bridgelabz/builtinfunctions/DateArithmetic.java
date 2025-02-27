package com.bridgelabz.builtinfunctions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


//2. Problem 2: Date Arithmetic Create a program that: 
//➢ Takes a date input and adds 7 days, 1 month, and 2 years to it. 
//➢ Then subtracts 3 weeks from the result. 
//Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and minusWeeks() methods. 

public class DateArithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	Define the date format
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//	Take date input from user
		System.out.println("Enter a date(yyyy-MM-dd)");
		String inputDate = sc.nextLine();
		//	convert input string to local date
		LocalDate date = LocalDate.parse(inputDate, formatter);

		//	convert date arithmetic
		LocalDate modifiedDate = date.plusDays(7)
				.plusMonths(1)
				.plusYears(2)
				.minusWeeks(3);
		System.out.println("Original Date : " + date.format(formatter));
		System.out.println("Modified Date : " + modifiedDate.format(formatter));

		sc.close();
	}
}
