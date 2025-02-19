package com.bridgelabz.classandobjects.leveltwo;

public class Student {
	// declared a private variables
	private String name;
	private int rollNumber;
	private double marks;
	// Initialized the variables using constructors
	public Student(String name, int rollNumber, double marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	// method to calculate the grade based on the marks on the student
	public String calculateGrade() {
		if(marks >= 90) {
			return "A";
		}
		else if(marks >= 70) {
			return "B";
		}
		else if(marks >= 50) {
			return "C";
		}
		else if(marks >= 30) {
			return "D";
		}
		return "F";
	}
	// method to display the details of the students along with the grade
	public void displayStudentResport() {
		System.out.println("\nName : " + name);
		System.out.println("Roll Number : " + rollNumber);
		System.out.println("Marks : " + marks);
		System.out.println("Grade : " + calculateGrade());
	}

}
