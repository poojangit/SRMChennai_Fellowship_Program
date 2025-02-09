package com.bridgelabz.practiceproblem.basic.level.one;

//todo : Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
//! Hint => NA
//! I/P => unitPrice, quantity
//! O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

import java.util.Scanner;

public class ItemPriceCalculation {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the unit price of an item: ");
		double unitPrice = sc.nextDouble();
		System.out.println("Enter the quantity to be bought");
		double quantity = sc.nextDouble();
		double totalPrice = unitPrice*quantity;
		System.out.println("The total price for " + quantity + " is " + totalPrice);
		sc.close();
	}
}

