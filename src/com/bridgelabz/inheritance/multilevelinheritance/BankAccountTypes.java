package com.bridgelabz.inheritance.multilevelinheritance;

// Main class to test different types of bank accounts
public class BankAccountTypes {
	public static void main(String[] args) {
		// Creating a general bank account instance
		BankAccount bankAccount = new BankAccount(802288282, 7000);
		bankAccount.displayAccountType();;

		// Creating a savings account instance
		SavingsAccount savingsAccount = new SavingsAccount(8282624, 1000, 4.9);
		savingsAccount.displayAccountType();

		// Creating a checking account instance
		CheckingAccount checkingAccount = new CheckingAccount(826242, 2000, 1000);
		checkingAccount.displayAccountType();

		// Creating a fixed deposit account instance
		FixedDepositAccount fixedDeposit = new FixedDepositAccount(872762, 10000, 12);
		fixedDeposit.displayAccountType();
	}
}
