package com.bridgelabz.inheritance.singleinheritance;

public class AnimalMainClass {
	public static void main(String[] args) {
		Dog dog = new Dog() ;
		dog.eat(); // Inherited from Animal
		dog.bark(); // Defined in dog
	}

}
