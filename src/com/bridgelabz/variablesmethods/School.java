package com.bridgelabz.variablesmethods;

public class School {
		String studentName; // instance variable
		static int totalStudents; // class variable
		
		School(String studentName){
			this.studentName = studentName;
			totalStudents++;
		}
		void displayStudent() {
			System.out.println("Student Name : " + studentName);
		}
		
		static void displayTotalStudents() {
			System.out.println("Total students : " + totalStudents);
		}
}
