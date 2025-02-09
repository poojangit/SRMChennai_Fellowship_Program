package com.bridgelabz.programtostartwith;

//Calculate Simple Interest
//Write a program to calculate simple interest using the formula:
//Simple Interest = (Principal * Rate * Time) / 100.
//Take Principal, Rate, and Time as inputs from the user.
import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the simple interest: ");
        System.out.println("Enter the principal amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest:  ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time taken : ");
        double time = sc.nextDouble();
        sc.close();
        double simpleInterest = (principal*rate*time)/100;
        System.out.println(simpleInterest);
    }
}