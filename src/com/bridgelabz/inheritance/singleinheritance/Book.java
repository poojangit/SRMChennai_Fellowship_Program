package com.bridgelabz.inheritance.singleinheritance;

//super class - Book
public class Book {
	// Book Attributes
	private String title;
	private int publicationYear;
	// Constructors for initializing the attributes
	public Book(String title, int publicatioYear) {
		this.title = title;
		this.publicationYear = publicatioYear;
	}
	// method to display the details
	public void displayInfo() {
		System.out.println("Title of the book : " + title);
		System.out.println("Year of publication : " + publicationYear);
	}

}
// sub-class - Author , extends the parents class 
class Author extends Book{
	// Author attributes
	private String name;
	private String bio;
	// Constructors for initializing the author
	public Author(String title, int publicatioYear, String name, String bio) {
		super(title, publicatioYear);
		this.name = name;
		this.bio = bio;	
	}
	// Method overriding 
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Name of the book : " + name);
		System.out.println("Bio : " + bio);
	}
}