package com.bridgelabz.classandobjects.levelone;

public class EmployeeMainClass {
	// main method 
	public static void main(String[] args) {
		// Object creation for employee 1
		Employee e1 = new Employee("Lakxmi", 12, 10000);
		// Object creating for employee 2
		Employee e2 = new Employee("Pooja", 11, 5000);

		//Displaying the details
		System.out.println("Displaying the details of Employee 1");
		e1.displayEmployeeDetails();
		System.out.println("------------------------");
		System.out.println("Displaying the details of Employee 2");
		e2.displayEmployeeDetails();
	}
}
