package com.bridgelabz.classandobjects.leveltwo;

//Program to Simulate an ATM
//Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
//Depositing money.
//Withdrawing money (only if sufficient balance exists).
//Displaying the current balance.
//Explanation: The BankAccount class stores bank account details as attributes. The methods allow interaction with these attributes to modify and view the account's state.

public class BankAccount {
	// declaring the variables
	private String accountHolder;
	private long accountNumber;
	private double balance;
	// Initializing the variables using constructor
	public BankAccount(String accountHolder, int accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	// method to deposit the amount
	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited amount : " + amount);
		} else 
			System.out.println("Invalid deposit amount");
	}
	// method to withdraw the amount
	public void withdraw(int amount) {
		//	condition added to check if the amount to withdraw is greater than balance
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn amount : " + amount);
		} else 
			System.out.println("Insufficient balance");
	}
	// method to display the Account details along with the names
	public void displayCurrentBalance () {
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Current balance : " + balance);
	}
}
