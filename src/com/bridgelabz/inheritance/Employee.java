package com.bridgelabz.inheritance;

public class Employee {
	// employee attributes
	public String empName;
	public int id;
	public double salary;
	// constructors for initializing the attributes
	public Employee(String empName, int id, double salary) {
		this.empName = empName;
		this.id = id;
		this.salary = salary;
	}
	// methods to display the employee details
	public void displayDetails() {
		System.out.println(" Name : " + empName);
		System.out.println(" Id : " + id);
		System.out.println(" Salary : " + salary);
	}
}

// subclass - Manager
class Manager extends Employee {
	public int teamSize;
	// constructor 
	public Manager(String empName, int id, double salary, int teamSize) {
		super(empName, id, salary);
		this.teamSize = teamSize;
	}
	@Override 
	public void displayDetails() {
		System.out.println("Manager details : ");
		super.displayDetails();
		System.out.println(" Role : Manager, Team size : " + teamSize);
	}
}
// subclass : Developer 
class Developer extends Employee {
	public String programmingLanguage;
	//	constructor
	public Developer(String empName, int id, double salary, String programmingLanguage) {
		super(empName, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	@Override
	public void displayDetails() {
		System.out.println("Developer Details : ");
		super.displayDetails();
		System.out.println(" Role : Developer, programming language : " + programmingLanguage);
	}
}
// subclass : Intern
class Intern extends  Employee {
	int internshipDuration; //in months
	// constructor
	public Intern(String empName, int id, double salary, int internshipDuration) {
		super(empName, id, salary);
		this.internshipDuration = internshipDuration;
	}
	@Override
	public void displayDetails() {
		System.out.println("Intern details : ");
		super.displayDetails();
		System.out.println(" Role : Interm, Internship duration : " + internshipDuration);
	}
}