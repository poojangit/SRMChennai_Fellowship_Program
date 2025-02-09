package com.bridgelabz.practiceproblem.controlflow.level.one;

//todo : Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
//! Hint => 
//! Get integer input from the user and store it in the age variable.
//! If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
//! I/P => age
//! O/P => If the person's age is greater or equal to 18 then the output is 
//! The person's age is ___ and can vote.
//! Otherwise 
//! The person's age is ___ and cannot vote.

import java.util.Scanner;

public class PersonCanVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter person age : ");
		int age = sc.nextInt();
		if(age >= 18){
			System.out.println("The person can vote");
		}
		else {
			System.out.println("cannot vote");
		}
		sc.close();
	}
}
