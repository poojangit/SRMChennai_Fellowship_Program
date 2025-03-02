package com.bridgelabz.accessmodifiers;
//Problem 2: Book Library System
//Design a Book class with:
//ISBN (public).
//title (protected).
//author (private).
//Write methods to:
//Set and get the author name.
//Create a subclass EBook to access ISBN and title and demonstrate access modifiers.

public class Book {
	// attributes
	public int ISBN; //public - accessible everywhere
	protected String title; // public - accessible to its subclass
	private String author; // private - accessible only to its class

	// constructor
	public Book(int ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	// public method to access the private variable
	public String getAuthor() {
		return author;
	}
	// public method to set the private variable
	public void setAuthor(String author) {
		this.author = author;
	}
	// method to display all the book details
	public void displayBookDetails() {
		System.out.println("ISBN : " + ISBN);
		System.out.println("title : " + title);
		System.out.println("author : " + author);
	}
}

// subclass - EBOOk
class Ebook extends Book {
	// private variables
	private double fileSizeMB;
	private String format;

	// constructors
	public Ebook(int ISBN, String title, String author, double fileSizeMB, String format) {
		super(ISBN, title, author);
		this.fileSizeMB = fileSizeMB;
		this.format = format;
	}
	//method to display the ebook details
	public void displayEbookDetails() {
		System.out.println("\nEbook details : ");
		System.out.println("ISBN : " + ISBN);
		System.out.println("Title : " + title);
		System.out.println("File size : " + fileSizeMB);
		System.out.println("Format : " + format);

	}
}