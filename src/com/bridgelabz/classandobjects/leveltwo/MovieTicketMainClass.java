package com.bridgelabz.classandobjects.leveltwo;

public class MovieTicketMainClass {
	// main method
	public static void main(String[] args) {
		// object creation for movieTicket 
		MovieTicket movie = new MovieTicket("Amaran", null, 0 );
		// calling a bookTicket method and assigning a values
		movie.bookTicket("A01", 150);
		System.out.println("Ticket details : ------------");
		// method to display the tickets
		movie.displayTicket();
	}
}
