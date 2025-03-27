package com.bridgelabz.inheritance.multilevelinheritance;

// Base class representing a general bank account
public class BankAccount {
	protected int accountNumber;
	protected double balance;

	// Constructor to initialize account number and balance
	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Method to display general account details
	public void displayAccountType() {
		System.out.println("Account Number : " + accountNumber + " Balance : " + balance);
	}
}

// Subclass representing a Savings Account
class SavingsAccount extends BankAccount {
	protected double interestRate;

	// Constructor to initialize savings account with interest rate
	public SavingsAccount(int accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}	

	// Overriding method to display savings account details
	@Override
	public void displayAccountType() {
		System.out.println("Account Type : Savings Account , Interest rate : " + interestRate + "%");
	}
}

// Subclass representing a Checking Account
class CheckingAccount extends BankAccount {
	protected double withdrawalLimit;

	// Constructor to initialize checking account with withdrawal limit
	public CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
		super(accountNumber, balance);
		this.withdrawalLimit = withdrawalLimit;
	}

	// Overriding method to display checking account details
	@Override
	public void displayAccountType() {
		System.out.println("Account type : Checking account , Withdrawal limit : " + withdrawalLimit);
	}
}

// Subclass representing a Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
	protected int depositTerm;

	// Constructor to initialize fixed deposit account with a deposit term
	public FixedDepositAccount(int accountNumber, double balance, int depositTerm) {
		super(accountNumber, balance);
		this.depositTerm = depositTerm;
	}

	// Overriding method to display fixed deposit account details
	@Override 
	public void displayAccountType() {
		System.out.println("Account type : Fixed Deposit Account, Deposit Term: " + depositTerm + " months" );
	}
}
