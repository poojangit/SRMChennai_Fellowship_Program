package com.bridgelabz.inheritance.multilevelinheritance;

//base class - course
public class Course {
	// attributes
	public String courseName;
	public int duration;
	// constructors for initializing the variables
	public Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}
	// methods for displaying the course details
	public String getCourseDetails() {
		return "Course: " + courseName + "\n" + "Duration: " + duration;
	}
}
// subclass - online course
class OnlineCourse extends Course {
	//attributes
	public String platform;
	public boolean isRecorded;
	// constructors
	public OnlineCourse(String courseName, int duration,String platform, boolean isRecorded) {
		super(courseName, duration);
		this.platform = platform;
		this.duration = duration;
	}
	// overring the methods of super class
	@Override
	public String getCourseDetails() {
		return "Platform : " + platform + "\n" + "Is recorded : " + isRecorded;
	}
}
// subclass - paidonlinecourse which extends the online course class
class PaidOnlineCourse extends OnlineCourse{
	// attributes
	public double fee;
	public double discount;
	// constructors for initializing the values
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	// overriding the methods to display the course details
	@Override
	public String getCourseDetails() {
		return "Fee : " + fee + "\n"+ "Discount : " + discount;
	}
}
