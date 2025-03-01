package com.bridgelabz.constructors.level1;

//Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.

public class CircleMainClass {
	// attributes 
	double radius;
	//default constructor
	public CircleMainClass(){
		this(1.0); //calls the default constructor
	}
	// parameterized constructor
	CircleMainClass(double radius){
		this.radius = radius;
	}
	// method to calculate and return the area of a circle
	public double getArea() {
		return Math.PI*radius*radius;
	}
	// method to display circle details
	public void displayAllDetails() {
		System.out.println("Circle radius: " + radius);
		System.out.println("Circle Area : " + getArea());
	}
	public static void main(String[] args) {
		CircleMainClass circle = new CircleMainClass();
		System.out.println("Radius of a circle : " + circle.getArea());
		System.out.println("----------------");
		CircleMainClass customisedCircle = new CircleMainClass(60.8);
		System.out.println("Radius of a circle : " + customisedCircle.getArea());
	}
}
