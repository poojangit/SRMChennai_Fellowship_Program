package com.bridgelabz.methods.levelone;
//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 

import java.util.Scanner;

public class SpringSeason {
	// define a method to check if the given date and month results in spring season or not
	public static boolean springSeasonCheck(int month, int date){
		if(month>=3 && month <= 6 && date >= 1 && date <=20){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take the user input for entering the month
		System.out.println("Enter the Month : ");
		int month = sc.nextInt();
		if(month<1 && month >12){
			System.out.println("Please enter a valid month ");
			month = sc.nextInt();
		}
		// take the input from the user for entering a date
		System.out.println("Enter a date : ");
		int date = sc.nextInt();
		if(date < 1 && date > 31){
			System.out.println("Please enter a valid date ");
			date = sc.nextInt();
		} 
		//  methods returns boolean so check if it is true or false
		if(springSeasonCheck(month, date)){
			System.out.println("Spring season");
		} else {
			System.out.println("Not a spring season");
		}
		sc.close();
	}
}
