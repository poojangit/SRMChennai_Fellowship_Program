package com.bridgelabz.inheritance;

public class Animal {
// animal attributes
	String name;
	int age;
	
// constructors for initialization
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
// method 
	public void makeSound() {
		System.out.println("Animal Makes sound");
	}
}
// Dog is a subclass
class Dog extends Animal {
// constructors using super keyword for initializing the parent class variables
	public Dog(String name, int age) {
		super(name,age);
	}
// overriding the parent class method
	@Override
	public void makeSound() {
		System.out.println(name + " is barking : wowh wowh");
	}
	
}
// cat is a subclass
class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);
	}
// overriding makeSound method
	@Override
	public void makeSound() {
		System.out.println(name + " meows : meow, meow ");
	}
}
// bird is a subclass
class Bird extends Animal {
	public Bird(String name, int age) {
		super(name, age);
	}
	@Override 
	public void makeSound() {
		System.out.println(name + " chirps : tweet tweet");
	}
}