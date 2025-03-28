package com.bridgelabz.inheritance.multilevelinheritance;

import java.util.Scanner;

public class SchoolSystemWithDifferentRoles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for name and age
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		sc.nextLine(); // Consume the newline character
		
		// Asking the user to choose a role
		System.out.println("Which role you are applying for?");
		System.out.println("1. Teacher");
		System.out.println("2. Student");
		System.out.println("3. Staff");
		int option = sc.nextInt();
		sc.nextLine(); // Consume the newline character
		
		// Handling different roles based on user input
		switch (option) {
		case 1: {
			// If the user is a teacher, get the subject they teach
			System.out.println("Enter the subject you Teach : ");
			String subject = sc.next();
			Teacher teacher = new Teacher(name, age, subject );
			teacher.displayRole();
			break;    
		}
		case 2 : {
			// If the user is a student, get their grade
			System.out.println("Enter your grade: ");
			char grade = sc.next().charAt(0);
			Student student = new Student(name, age, grade);
			student.displayRole();
			break;
		}
		case 3 : {
			// If the user is staff, get their department
			System.out.println("Enter your department : ");
			String department = sc.next();
			Staff staff = new Staff(name, age, department);
			staff.displayRole();
			break;
		}
		default:
			// Handling unexpected input
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}
}
