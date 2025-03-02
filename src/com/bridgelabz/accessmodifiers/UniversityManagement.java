package com.bridgelabz.accessmodifiers;

public class UniversityManagement {
	public static void main(String[] args) {
		//	student object creation
		Student student1 = new Student(100, "Pooja" , 7.9);
		System.out.println("Student Details : ");
		student1.displayStudentDetails();
		//	modifying cgpa
		student1.setCGPA(8.0);
		System.out.println("\nUpdated the cgpa to : " + student1.getCGPA());
		PostgraduateStudent pgStudent = new PostgraduateStudent(221, "Preethi", 9.7, "Medicine");
		pgStudent.displayPGDetails();
	}

}
