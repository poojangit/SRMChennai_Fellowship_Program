package com.bridgelabz.practiceproblem.controlflow.level.one;

//todo : Write a program to check if a number is divisible by 5
//! I/P => number
//! O/P => Is the number ___ divisible by 5? _

import java.util.Scanner;

public class DivisibilityCheck {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      //checking true or false using if loop.
      if(num%5 == 0){
          System.out.println("Number is divisible by 5");
      }
      else
      System.out.println("Number is not divisible");
      sc.close();
  }
}