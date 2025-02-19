package com.bridgelabz.classandobjects.levelone;

public class Circle {
	// declared the radius attribute
	private double radius;

	// constructor for initializing the variables
	public Circle(double radius) {
		this.radius = radius;
	}
	// method to calculate the area of circle
	public double calculateAreaOfCircle(double radius) {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	// method to calculate the circumference of a circle
	public double calculateCircumferenceOfaCircle() {
		double circumference = 2*Math.PI*radius;
		return circumference;
	}
	// method to display the area and circumference of a circle
	public void displayAreaAndCircumference() {
		System.out.println("Area of Circle : " + calculateAreaOfCircle(radius));
		System.out.println("Circumference of a Circle : " + calculateCircumferenceOfaCircle());
	}

}
