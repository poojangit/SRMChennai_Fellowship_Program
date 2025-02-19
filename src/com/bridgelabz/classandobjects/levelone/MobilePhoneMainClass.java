package com.bridgelabz.classandobjects.levelone;

public class MobilePhoneMainClass {
	//main method
	public static void main(String[] args) {
		// create an objects for Mobile 
		MobilePhone mobile1 = new MobilePhone("Oppo", "Reno 8 T 5G", 30000);
		MobilePhone mobile2 = new MobilePhone("Realme" , " 6Y" , 25000);
		// display the details of Mobile
		System.out.println("Displaying the details : ");
		System.out.println("\nMobile 1 : ");
		mobile1.displayMobile();
		System.out.println("\nMobile 2 : ");
		mobile2.displayMobile();
	}

}
