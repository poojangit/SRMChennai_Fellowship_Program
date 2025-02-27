package com.bridgelabz.variablesmethods;


 public class SchoolMain {
	 public static void main(String[] args) {
		School student1 = new School("Alice");
		School student2 = new School("Bob");
		student1.displayStudent();
		student2.displayStudent();
		School.displayTotalStudents(); //Accessing class method
	}
 }
