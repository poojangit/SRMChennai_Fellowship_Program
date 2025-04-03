package com.bridgelabz.inheritance.hybridinheritance;

// subclass - chef that extends Super class and implements a worker interface
public class Chef extends Person implements Worker{

	// Constructor
	public Chef(String name, int id) {
		super(name, id);
	}
	// Method Overriding
	@Override
	public void performDuties() {
		System.out.println("Chef " + name + " is baking a cake");
	}

}
