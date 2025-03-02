package com.bridgelabz.accessmodifiers;
//Problem 3: Bank Account Management
//Create a BankAccount class with:
//accountNumber (public).
//accountHolder (protected).
//balance (private).
//Write methods to:
//Access and modify balance using public methods.
//Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.

//Base Class: BankAccount
class BankAccount {
 public String accountNumber;   // Public - Can be accessed anywhere
 protected String accountHolder; // Protected - Accessible in subclasses
 private double balance;        // Private - Only accessible within this class

 // Constructor
 public BankAccount(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Public method to access the balance
 public double getBalance() {
     return balance;
 }

 // Public method to modify the balance (deposit)
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: Rs " + amount);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 // Public method to modify the balance (withdrawal)
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: Rs " + amount);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance!");
     }
 }

 // Display account details
 public void displayAccountDetails() {
     System.out.println("\n--- Account Details ---");
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: Rs " + balance);
 }
}

//Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
 private double interestRate; // Additional attribute for savings account

 // Constructor for SavingsAccount
 public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 // Method to calculate interest
 public double calculateInterest() {
     return getBalance() * (interestRate / 100);
 }

 // Display Savings Account details
 public void displaySavingsAccountDetails() {
     System.out.println("\n--- Savings Account Details ---");
     System.out.println("Account Number: " + accountNumber); // Accessing public member from superclass
     System.out.println("Account Holder: " + accountHolder); // Accessing protected member from superclass
     System.out.println("Interest Rate: " + interestRate + "%");
     System.out.println("Estimated Interest: Rs " + calculateInterest());
 }
}