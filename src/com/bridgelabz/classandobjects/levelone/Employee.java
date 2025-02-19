package com.bridgelabz.classandobjects.levelone;

public class Employee {
	// declaring the Attributes 
	private String name;
	private int id;
	private double salary;

	// Constructors
	public Employee(String name, int id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	// method to display the details of employee
	public void displayEmployeeDetails() {
		System.out.println("Employee name : " + name);
		System.out.println("Employee ID : " + id);
		System.out.println("Employee salary : " + salary);
	}

}
