package com.bridgelabz.constructors.level1;
//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
public class BookMainClass {
	// attributes	
	String title;
	String author;
	double price;

	// default constructor
	BookMainClass(){
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
	}
	// parameterized constructor
	BookMainClass(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public static void main(String[] args) {
		// Creating a book object using default constructor
		BookMainClass defaultBook = new BookMainClass();
		// creating a book object using parameterized constructor
		BookMainClass customisedBook = new BookMainClass("Revolution 2020", "Chethan bhagath", 200);
		// accessing the variables using the object reference from a parameterized constructor
		System.out.println("Title : " + customisedBook.title);
		System.out.println("Author : " +  customisedBook.author);
		System.out.println("Price : " +  customisedBook.price);
		System.out.println("--------------------------");
		// accessing the variables using the object reference from the default constructor
		System.out.println("Title :" +defaultBook.title);
		System.out.println("Author : " + customisedBook.author);
		System.out.println("Price : " +  customisedBook.price);
	}
}
