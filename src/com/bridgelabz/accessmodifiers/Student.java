package com.bridgelabz.accessmodifiers;
//Problem 1: University Management System
//Create a Student class with:
//rollNumber (public).
//name (protected).
//CGPA (private).
//Write methods to:
//Access and modify CGPA using public methods.
//Create a subclass PostgraduateStudent to demonstrate the use of protected members.

//base class
public class Student {
	public int rollNumber;
	protected String name;
	private double CGPA;

	// constructor
	public Student(int rollNumber, String name, double CGPA) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	// public method to access the cgpa
	public double getCGPA() {
		return CGPA;
	}
	// method to modify the private variable
	public void setCGPA(double CGPA) {
		if(CGPA >= 0 && CGPA <= 10) {
			this.CGPA = CGPA;
		} else {
			System.out.println("Invalid CGPA entered!!");
		}
	}
	//	method to display the student details
	public void displayStudentDetails() {
		System.out.println("Roll number : " + rollNumber);
		System.out.println("Name : " + name);
		System.out.println("CGPA : " + CGPA);
	}
}
//Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {
	private String researchTopic;

	// constructor
	public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
		super(rollNumber, name, CGPA);
		this.researchTopic = researchTopic;
	}
	// method to display the postgraduate student details
	public void displayPGDetails() {
		System.out.println("\nPostgraduate students details : ");

		displayStudentDetails(); //calling superclass method
		System.out.println("Research Topic : " + researchTopic);
	}

}
