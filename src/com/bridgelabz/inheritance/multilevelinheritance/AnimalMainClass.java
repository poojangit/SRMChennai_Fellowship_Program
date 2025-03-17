package com.bridgelabz.inheritance.multilevelinheritance;

public class AnimalMainClass {
	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		puppy.eat(); //Inherited from Animal
		puppy.bark(); // Inherited from Dog
		puppy.play(); //Defined in Puppy
	}
}
