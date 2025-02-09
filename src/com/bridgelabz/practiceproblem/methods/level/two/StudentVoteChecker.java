package com.bridgelabz.practiceproblem.methods.level.two;
//Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
//Hint => 
//Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
//Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false;
//In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote() and display the result

import java.util.Scanner;

public class StudentVoteChecker {

	// method to check if the student can vote or not 
	public static boolean canStudentVote(int age) {
		// return false invalid age negative age
		if(age < 0) {
			System.out.println("Invalid age has been entered.");
			return false;
		}
		return age >= 18;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Take the input from the user for all the 10 students 
		System.out.println("Enter the age of all the 10 students");
		int[] studentAges = new int[10];
		for(int i=0 ; i<studentAges.length; i++) {
			studentAges[i] = sc.nextInt(); 
		}
		//	display the results of all the student's age who can vote
		for(int i=0; i<studentAges.length; i++ ) {
			boolean canVote = canStudentVote(studentAges[i]);
			if(canVote) {
				System.out.println(studentAges[i] + " can vote" );
			}
			else {
				System.out.println(studentAges[i] + " Cannot vote");
			}
		}
		System.out.println();
		sc.close();

	}

}
