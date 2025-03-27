package com.bridgelabz.inheritance.singleinheritance;

public class LibraryManagement {
	public static void main(String[] args) {
		//	Creating an author object
		Author bookDetails = new Author("Revolution 2020", 2021, "Chethan bhagath", "A triangle love story between three friends");
		//	Displaying book and author
		bookDetails.displayInfo();
	}

}
