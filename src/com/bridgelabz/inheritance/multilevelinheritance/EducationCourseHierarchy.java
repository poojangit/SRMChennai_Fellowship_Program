package com.bridgelabz.inheritance.multilevelinheritance;

//Main class
public class EducationCourseHierarchy {
	//main method
	public static void main(String[] args) {
		// new object creation for course
		Course course = new Course("Java Basics", 40);
		System.out.println(course.getCourseDetails());
		// new object creation for online course
		OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 60, "Udemy", true);
		System.out.println(onlineCourse.getCourseDetails());
		// new object creation for paid online course
		PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Full Stack Development", 100, "Coursera", true, 200, 10);
		System.out.println(paidOnlineCourse.getCourseDetails());
	}
}
