package com.bridgelabz.programtostartwith;

import java.util.Scanner;

//Write a program to calculate the area of a circle. Take the radius as input
//and use the formula:
//Area = π * radius^2.

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		Double Area = Math.PI * (radius*radius);
		System.out.println("Area of a circle is " + Area);
		sc.close();
	}

}
