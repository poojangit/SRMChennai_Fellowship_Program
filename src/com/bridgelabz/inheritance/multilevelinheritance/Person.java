package com.bridgelabz.inheritance.multilevelinheritance;

// Superclass - Person
public class Person {
    // Common attributes for all roles
    protected String name;
    protected int age;

    // Constructor to initialize Person attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass - Teacher extending superclass Person
class Teacher extends Person {
    // Specific attribute for Teacher
    protected String subject;

    // Constructor to initialize Teacher attributes
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display role-specific details
    public void displayRole() {
        System.out.println("---------Role : Teacher---------");
        System.out.println("Name : " + name + "\nAge : " + age + "\nSubject : " + subject);
    }
}

// Subclass - Student extending superclass Person
class Student extends Person {
    // Specific attribute for Student
    protected char grade;

    // Constructor to initialize Student attributes
    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display role-specific details
    public void displayRole() {
        System.out.println("--------Role : Student-----------");
        System.out.println("Name : " + name + "\nAge : " + age + "\nGrade : " + grade);
    }
}

// Subclass - Staff extending superclass Person
class Staff extends Person {
    // Specific attribute for Staff
    protected String department;

    // Constructor to initialize Staff attributes
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to display role-specific details
    public void displayRole() {
        System.out.println("--------Role : Staff------------");
        System.out.println("Name : " + name + "\nAge : " + age + "\nDepartment : " + department);
    }
}
