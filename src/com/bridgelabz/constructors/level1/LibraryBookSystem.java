package com.bridgelabz.constructors.level1;
//Library Book System: Create a Book class with attributes title, author, price, and availability. Implement a method to borrow a book.

public class LibraryBookSystem {
//attributes
 private String title;
 private String author;
 private double price;
 private boolean isAvailable;
 
// constructor with parameters
 public LibraryBookSystem(String title,String author, double price) {
	 this.title = title;
	 this.author = author;
	 this.price = price;
	 this.isAvailable = true;
 }
// method to borrow a book
 public void borrowBook() {
	 if(isAvailable) {
		 isAvailable = false; //mark book as borrowed
		 System.out.println("Successfully borrowed : " + title);
	 } else {
		 System.out.println("Sorry, the book " + title + " is currently unavailable");
	 }
 }
 public void displayDetails() {
	 System.out.println("Title : " + title);
	 System.out.println("Author : " + author);
	 System.out.println("Price : " + price);
	 System.out.println("Availability : " + (isAvailable? "Available":"Not available"));
 }
 public static void main(String[] args) {
     // Creating a book object
     LibraryBookSystem book1 = new LibraryBookSystem("The Alchemist", "Paulo Coelho", 499.99);

     // Display book details before borrowing
     System.out.println("Book Details:");
     book1.displayDetails();

     // Borrow the book
     System.out.println("\nTrying to borrow the book...");
     book1.borrowBook();

     // Display book details after borrowing
     System.out.println("\nUpdated Book Details:");
     book1.displayDetails();

     // Trying to borrow again
     System.out.println("\nAttempting to borrow again...");
     book1.borrowBook();
 }
}
