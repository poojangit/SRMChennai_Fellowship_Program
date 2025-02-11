package com.bridgelabz.methods.levelthree;

//Create a program to find the shortest, tallest, and mean height of players present in a football team.
//Hint => 
//The formula to calculate the mean is: mean = sum of all elements/number of elements
//Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
//Write the method to Find the sum of all the elements present in the array.
//Write the method to find the mean height of the players on the football team
//Write the method to find the shortest height of the players on the football team 
//Write the method to find the tallest height of the players on the football team
//Finally display the results

import java.util.Random;
import java.util.Scanner;

public class FootballTeam {
	// method to find the sum of heights
	public static int sumOfAllHeights(int[] heights) {
		int sum = 0;
		for (int height : heights) {
			sum += height;
		}
		return sum;
	}
	// method to find the mean heights
	public static double meanHeight(int[] heights) {
		// formula to find the mean
		double mean = (double)sumOfAllHeights(heights)/heights.length;
		return mean;
	}
	// method to find the shortest height
	public static double findShortestHeight(int[] heights) {
		double shortHeight = heights[0];
		for (int height : heights) {
			if (height < shortHeight) {
				shortHeight = height;
			}
		}
		return shortHeight;
	}
	// method to find the tallest height
	public static double findTallestHeight(int[] heights) {
		double tallestHeight = heights[0];
		for (int height : heights) {
			if (height > tallestHeight) {
				tallestHeight = height;
			}
		}
		return tallestHeight;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Heights of the football players: ");
		Random random = new Random();
		// Create an int array named heights of size 11 
		int[] heights = new int[11];
		// System.out.println(heights.length);
		//	get 3 digits random height in cms for each player in the range 150 cms to 250 cms
		for(int i=0; i<heights.length; i++) {
			heights[i] = random.nextInt(101)+150;
		}
		for(int i=0; i<heights.length; i++ ) {
			System.out.println("The height of player " + (i+1) + " is " +heights[i]);
		}
		//	display the results of shortest height, tallest height, mean height
		System.out.println("The shortest player is " + findShortestHeight(heights));
		System.out.println("The tallest player is " + findTallestHeight(heights));
		System.out.println("The mean height is " + meanHeight(heights));
		sc.close();
	}
}
