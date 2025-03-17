package com.bridgelabz.inheritance;

// creting a employee main class
public class EmployeeMainClass {
	// main method
	public static void main(String[] args) {
		//	creating 3 different objects to each class
		Employee manager = new Manager("Sunil", 10, 80000, 5);
		Employee developer = new Developer("Pooja", 51425, 33000, "Java");
		Employee intern = new Intern("Muktha", 19, 1500, 3);
		manager.displayDetails();
		System.out.println();
		developer.displayDetails();
		System.out.println();
		intern.displayDetails();
	}

}
