package com.bridgelabz.inheritance.hierarchicalinheritance;

public class AnimalMainClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark(); //Inherited from Animal
		dog.eat(); //Defined in dog
		Cat cat = new Cat();
		cat.eat(); // Inherited from animal
		cat.meow(); // Defined in cat
	}

}
