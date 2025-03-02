package com.bridgelabz.accessmodifiers;

public class BankAccountManagement {
	 public static void main(String[] args) {
	        // Creating a BankAccount object
	        BankAccount account1 = new BankAccount("123456789", "Pooja N G", 5000.0);
	        account1.displayAccountDetails();

	        // Performing transactions
	        account1.deposit(1000.0);
	        account1.withdraw(2000.0);
	        System.out.println("Updated Balance: Rs " + account1.getBalance());

	        // Creating a SavingsAccount object
	        SavingsAccount savings1 = new SavingsAccount("987654321", "Dheeraj", 10000.0, 5.0);
	        savings1.displaySavingsAccountDetails();
	    }
}
