package com.bridgelabz.oops;

import java.util.Scanner;

public class StudentMarks {
	// Function to calculate total marks
	public static int calculateTotal(int marks1, int marks2, int marks3) {
		return marks1 + marks2 + marks3;
	}
	// Function to calculate averate marks 
	public static double calculateAverage(int total, int numberOfStudents) {
		return (double) total/numberOfStudents;
	}
	// Function to display the results
	public static void displayResults(String name, int total, double average) {
		System.out.println("Student name : " + name);
		System.out.println("Total Marks : " + total);
		System.out.println("Average Marks : " + average);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//	input the student name 
		System.out.println("Enter the Student's name : ");
		String name = sc.nextLine();
		//	Input marks for 3 subjects
		System.out.println("Enter the marks for subject 1");
		int marks1 = sc.nextInt();
		System.out.println("Enter the marks for subject 2");
		int marks2 = sc.nextInt();
		System.out.println("Enter the marks for subject 3");
		int marks3 = sc.nextInt();
		//	calculate the total and average marks
		int total = calculateTotal(marks1, marks2, marks3);
		double average = calculateAverage(total, 3);
		//	display results
		displayResults(name, total, average);

		sc.close();
	}

}
