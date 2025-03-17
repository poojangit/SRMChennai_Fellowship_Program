package com.bridgelabz.inheritance;

public class AnimalMainClass {
	// main method
	public static void main(String[] args) {
		//	creating 3 different 
		Animal dog = new Dog("Tuffy" , 7);
		Animal cat = new Cat("Joxy", 2);
		Animal bird = new Bird("Chibbi", 1);
		// Demonstrating method overriding and polymorphism
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}
