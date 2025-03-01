package com.bridgelabz.constructors.level1;

public class Person {
	// attributes of a person
	private String name;
	private int age;
	// default constructor is called
	public Person() {
		this.name = "Unknown";
		this.age = 0;
		System.out.println("Default constructor");
	}
	// parameterized constructor is called
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	// copy constructor(cloning other person's object
	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
	}
	// method to display the details of a person
	public void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	//	main method
	public static void main(String[] args) {
		System.out.println("Printing a details without a parameters : ");
		Person person1 = new Person();
		person1.displayDetails();
		System.out.println();
		System.out.println("printing a details with parameters : ");
		Person person2 = new Person("Pooja", 22);
		person2.displayDetails();
		System.out.println();
		System.out.println("Printing the details of person2 by using copy constructor : ");
		Person person3 = new Person(person2);
		person3.displayDetails();
	}
}
