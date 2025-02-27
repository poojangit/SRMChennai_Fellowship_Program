package com.bridgelabz.builtinfunctions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Problem 3: Date Formatting Write a program that: 
//➢ Displays the current date in three different formats: 
//■ dd/MM/yyyy 
//■ yyyy-MM-dd 
//■ EEE, MMM dd, yyyy 
//Hint: Use DateTimeFormatter with custom patterns for date formatting. 

public class DateFormatting {
	public static void main(String[] args) {
		//	get the current date
		LocalDate currentDate = LocalDate.now();
		//	 format the date into different patterns
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		//	print the formatted result
		System.out.println("Date in dd/MM/yyy format :  " + currentDate.format(format1));
		System.out.println("Date in yyyy-MM-dd format :  " + currentDate.format(format2));
		System.out.println("Date in EEE, MMM dd, yyyy format :  " + currentDate.format(format3));
	}

}
