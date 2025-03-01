package com.bridgelabz.constructors.level1;
//Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
	// declaration of attributes
	private String guestName;
	private String roomType;
	private int nights;
	// default constructor
	public HotelBooking() {
		this.guestName = "Unknown";
		this.roomType = "Unknown";
		this.nights = 0;
	}
	// parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	// copy constructor
	public HotelBooking(HotelBooking other) {
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	// method to display the details of a guest
	public void displayHotelDetails() {
		System.out.println("Guest Name : " + guestName);
		System.out.println("Room type : " + roomType);
		System.out.println("Nights : " + nights);
	}
	// main method
	public static void main(String[] args) {
		//	object creation using default constructor
		HotelBooking hotel1 = new HotelBooking();
		System.out.println("Displaying the details of hotel of a default constructor :");
		hotel1.displayHotelDetails();
		System.out.println("----------------------");
		//	object creation using parameterized constructor
		HotelBooking hotel2 = new HotelBooking("Pooja N G", "1BHK", 2);
		System.out.println("Details of Parameterized constructor :");
		hotel2.displayHotelDetails();
		System.out.println("----------------------");
		//	object creation using copy constructor
		System.out.println("Details of copy constructor: ");
		HotelBooking hotel3 = new HotelBooking(hotel2);
		hotel3.displayHotelDetails();
	}
}
