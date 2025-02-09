package com.bridgelabz.practiceproblem.methods.level.two;

import java.util.Scanner;

public class Quadratic {
	// Method to find the roots
	public static double[] findTheRoots(int a, int b , int c) {
		// calculation to find the delta value
		double delta = Math.pow(b, 2) + 4 * a * c;
		if(delta > 0) {
			double root1 = (-b+ Math.sqrt(delta))/(2*a);
			double root2 = (-b-Math.sqrt(delta))/(2*a);
			return new double[] {root1, root2};
		} else if(delta == 0) {
			double root = -b/(2*a);
			return new double[] {root};
		}
		// return empty array if the delta value is negative
		else {
			return new double[] {};
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	take the input from the user 
		System.out.println("Enter a 3 input values to find the roots of x : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double[] roots = findTheRoots(a, b, c);

		// check for the root length
		if (roots.length == 0) {
			System.out.println("The equation has no real roots.");
		} else if (roots.length == 1) {
			System.out.printf("The equation has one root: " + roots[0]);
		} else {
			System.out.printf("The equation has two roots: " +  roots[0] + " and " + roots[1]);
		}
		sc.close();
	}
}
