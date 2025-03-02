package com.bridgelabz.variablesmethods;
//Problem 2: Online Course Management
//Design a Course class with:
//Instance Variables: courseName, duration, fee.
//Class Variable: instituteName (common for all courses).
//Methods:
//An instance method displayCourseDetails() to display the course details.
//A class method updateInstituteName() to modify the institute name for all courses.

public class Course {
	// declaration of instance variable
	private String courseName;
	private int duration;
	private double fee;
	// declaration and initialization of class variable
	public static String instituteName = "J Spiders";
	// constructors
	public Course(String courseName, int duration , double fee) {
		this.courseName = courseName;
		this.duration = duration; //in months
		this.fee = fee;
	}
	// instance method to display the course details
	public void displayCourseDetails() {
		System.out.println("Institute name : " + instituteName);
		System.out.println("Course Name : " + courseName);
		System.out.println("Duration : " + duration);
		System.out.println("Fee : " + fee);
	}
	//	class method to update the institute name
	public static void updateInstituteName(String newInstituteName) {
		instituteName = newInstituteName;
	}
	// main method
	public static void main(String[] args) {
		//	creating course objects
		Course course1 = new Course("Java Full Stack", 6, 40000);
		Course course2 = new Course("Mern stack" , 5, 35000);

		//	before institute name update 
		System.out.println("Displaying details of course 1 ----------");
		course1.displayCourseDetails();
		System.out.println();
		System.out.println("Displaying details of course 2 ----------");
		course2.displayCourseDetails();
		//	after institute name update 
		System.out.println("\n------ Institute name changed --------");
		Course.instituteName = "J Spiders, Basavanagudi";
		System.out.println("Details of course 1 : ");
		course1.displayCourseDetails();
		System.out.println();
		System.out.println("Details of course 2 : ");
		course2.displayCourseDetails();

	}
}
