package com.bridgelabz.inheritance.multilevelinheritance;

public class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking");
	}
}
class Puppy extends Dog{
	void play() {
		System.out.println("Puppy is playing");
	}
}
