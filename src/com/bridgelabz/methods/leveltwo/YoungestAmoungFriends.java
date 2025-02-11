package com.bridgelabz.methods.leveltwo;
//Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
//Hint => 
//Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
//Write a Method to find the youngest of the 3 friends
//Write a Method to find the tallest of the 3 friends

import java.util.Scanner;

public class YoungestAmoungFriends {

	// Method to find the youngest friend
	public static String findYoungest(String[] names, int[] ages) {
		int minAge = ages[0];
		String youngest = names[0];
		for (int i = 1; i < ages.length; i++) {
			if (ages[i] < minAge) {
				minAge = ages[i];
				youngest = names[i];
			}
		}
		return youngest;
	}

	// Method to find the tallest friend
	public static String findTallest(String[] names, int[] heights) {
		int maxHeight = heights[0];
		String tallest = names[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] > maxHeight) {
				maxHeight = heights[i];
				tallest = names[i];
			}
		}
		return tallest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] friends = {"Amar", "Akbar", "Anthony"};
		int[] ages = new int[3];
		int[] heights = new int[3];
		
		//Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
		System.out.println("Enter the ages of 3 students named Amar, Akbar, and Anthony:");
		for (int i = 0; i < ages.length; i++) {
			System.out.print(friends[i] + "'s age: ");
			ages[i] = sc.nextInt();
		}

		System.out.println("Enter the heights (in cm) of 3 students named Amar, Akbar, and Anthony:");
		for (int i = 0; i < heights.length; i++) {
			System.out.print(friends[i] + "'s height: ");
			heights[i] = sc.nextInt();
		}

		String youngest = findYoungest(friends, ages);
		String tallest = findTallest(friends, heights);

		System.out.println("The youngest among the 3 friends is: " + youngest);
		System.out.println("The tallest among the 3 friends is: " + tallest);

		sc.close();
	}
}
