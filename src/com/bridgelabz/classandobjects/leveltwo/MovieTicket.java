package com.bridgelabz.classandobjects.leveltwo;

public class MovieTicket {
	// declaring the attributes using private variable
	private String movieName;
	private String seatNumber;
	private double price;
	private boolean isBooked;

	// constructors for initializing the varibles
	public MovieTicket(String movieName, String seatNumber, double price) {
		this.movieName = movieName;
		this.seatNumber = "Not mentioned";
		this.price = 0 ;
		this.isBooked = false;
	}
	// method to book a ticket by taking two parameters seatNumber and price
	public void bookTicket(String seatNumber , double price) {
		if(!isBooked) {
			this.seatNumber = seatNumber;
			this.price = price;
			isBooked = true;
			System.out.println("Ticket Booked successfully for " + movieName + " at seat " + seatNumber);
		} else {
			System.out.println("Seat " + seatNumber + " is already booked");
		}
	}
	// method to display the ticket details
	public void displayTicket() {
		if(isBooked) {
			System.out.println("Movie name : " + movieName);
			System.out.println("Seat number : " + seatNumber);
			System.out.println("price : " + price);
		}
		//	if no ticket is found return it 
		else {
			System.out.println("No ticket details found!!");
		}
	}
}
