package com.bridgelabz.methods.levelone;

//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint => 
//Take user input for 3 sides of a triangle 
//The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//Write a Method to compute the number of rounds user needs to do to complete 5km run

import java.util.Scanner;

public class AthleteRuns {
	// methods for finding the numberOfRounds
	public static double numberOfRounds(int sides, int distance){
		// find the perimeter of triangle
		int perimeterOfTriangle = sides+sides+sides;
		// calculate the number of rounds using the given formula
		double rounds = distance/perimeterOfTriangle;
		return rounds;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initial the distance to 5000 and make it as a constant
		final int DISTANCE = 5000;
		//  Take the input for 3 sides of triangle from the user
		System.out.println("\nEnter the values for 3 sides of triangle in meters  :");
		int sides = 0;
		//  loop till 3 for taking the 3 inut values
		for(int i=0; i<3;i++){
			System.out.println("Side " + (i+1) + " : ");
			sides = sc.nextInt();

		}
		System.out.println("Number of rounds : " +  numberOfRounds(sides, DISTANCE));
		sc.close();
	}
}
