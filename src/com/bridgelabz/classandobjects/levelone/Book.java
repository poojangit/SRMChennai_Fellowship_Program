package com.bridgelabz.classandobjects.levelone;

public class Book {
	//declaring the attributes
	private String title;
	private String author;
	private double price;

	// Constructors for initializing the variables
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	// methods to display the book details 
	public void displayBookDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("price : " + price);
	}
}
