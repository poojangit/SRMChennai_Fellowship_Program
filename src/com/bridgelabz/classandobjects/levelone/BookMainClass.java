package com.bridgelabz.classandobjects.levelone;

public class BookMainClass {
	// main method
	public static void main(String[] args) {
		//	creating a book objects
		Book book1 = new Book("Can we be Strangers again? ", "Shrijeet Shandilya" , 300 );
		Book book2 = new Book("Revolution 2020 " , "Rabindranath tagore" , 150);

		// displaying the details of the books
		System.out.println("Displaying the details of Books : ");
		System.out.println("\nBook1 : ");
		book1.displayBookDetails();
		System.out.println("-----------------");
		System.out.println("Book2 : ");
		book2.displayBookDetails();
	}
}
