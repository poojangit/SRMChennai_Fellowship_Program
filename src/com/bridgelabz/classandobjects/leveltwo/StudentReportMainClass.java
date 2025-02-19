package com.bridgelabz.classandobjects.leveltwo;

public class StudentReportMainClass {
	// Main method
	public static void main(String[] args) {
		//	created 3 student objects
		Student s1 = new Student("Pooja", 1514, 92.9);
		Student s2 = new Student("Preethi", 1515, 18);
		Student s3 = new Student("Pachu", 1516, 78);
		//	displaying the report of students
		System.out.println("Student Marks Report: ");
		s1.displayStudentResport();
		System.out.println("----------------");
		s2.displayStudentResport();
		System.out.println("----------------");
		s3.displayStudentResport();
	}
}
