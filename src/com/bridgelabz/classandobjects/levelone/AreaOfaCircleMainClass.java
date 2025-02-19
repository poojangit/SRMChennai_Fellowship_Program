package com.bridgelabz.classandobjects.levelone;

public class AreaOfaCircleMainClass {
	public static void main(String[] args) {
		// Creating a Circle object and initialized the radius value
		Circle circle = new Circle(12);
		//	displaying the result by calling the display method
		System.out.println("Displaying the Required output : ");
		System.out.println();
		circle.displayAreaAndCircumference();
	}
}
