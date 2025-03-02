package com.bridgelabz.accessmodifiers;

public class BookLibrarySystem {
	//	main method
	public static void main(String[] args) {
		//	 creating a book object
		Book  book1 = new Book(10981, "Revolution 2020", "Chethan");
		System.out.println("Displaying Book details : ");
		book1.displayBookDetails();
		//updating a private varible
		book1.setAuthor("Bhagath");
		System.out.println("\nUpdated the author name to : " + book1.getAuthor());
		Ebook ebook1 = new Ebook(15241, "Head first java", "Kathy Sierra" , 13.34, "PDF");
		ebook1.displayEbookDetails();
	}

}
