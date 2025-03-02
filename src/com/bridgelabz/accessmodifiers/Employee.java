package com.bridgelabz.accessmodifiers;
//Problem 4: Employee Records
//Develop an Employee class with:
//employeeID (public).
//department (protected).
//salary (private).
//Write methods to:
//Modify salary using a public method.
//Create a subclass Manager to access employeeID and department.

//Base Class: Employee
class Employee {
	public int employeeID;          // Public - Can be accessed anywhere
	protected String department;    // Protected - Accessible in subclasses
	private double salary;          // Private - Only accessible within this class

	// Constructor
	public Employee(int employeeID, String department, double salary) {
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}

	// Public method to access the salary
	public double getSalary() {
		return salary;
	}

	// Public method to modify the salary
	public void setSalary(double newSalary) {
		if (newSalary > 0) {
			this.salary = newSalary;
			System.out.println("Updated Salary: Rs " + salary);
		} else {
			System.out.println("Invalid salary amount!");
		}
	}

	// Display Employee details
	public void displayEmployeeDetails() {
		System.out.println("\n--- Employee Details ---");
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + department);
		System.out.println("Salary: Rs " + salary);
	}
}
//Subclass: Manager
class Manager extends Employee {
	private String teamName; // Additional attribute for managers

	// Constructor for Manager
	public Manager(int employeeID, String department, double salary, String teamName) {
		super(employeeID, department, salary);
		this.teamName = teamName;
	}

	// Display Manager details
	public void displayManagerDetails() {
		System.out.println("\n--- Manager Details ---");
		System.out.println("Employee ID: " + employeeID); // Accessing public member from superclass
		System.out.println("Department: " + department);  // Accessing protected member from superclass
		System.out.println("Managing Team: " + teamName);
	}
}