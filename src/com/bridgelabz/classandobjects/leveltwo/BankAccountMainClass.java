package com.bridgelabz.classandobjects.leveltwo;

import java.util.Scanner;

public class BankAccountMainClass {
	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Take the user name from the user input
		System.out.print("Enter your name : ");
		String accountHolder = sc.nextLine();
		//	input the account number from the user
		System.out.print("Enter account number : ");
		int accountNumber = sc.nextInt();
		//	creating a Object of BankAccount class
		BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, 1000) ;
		System.out.println("-----------------");
		// calling the deposit method
		bankAccount.deposit(200);
		bankAccount.displayCurrentBalance();
		System.out.println("-----------------");
		//	calling the withdraw method
		bankAccount.withdraw(500);
		bankAccount.displayCurrentBalance();
		sc.close();
	}

}
