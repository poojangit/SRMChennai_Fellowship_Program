package com.bridgelabz.inheritance.hybridinheritance;

//subclass - waiter extending a Person superclass and implements a Worker interface
public class Waiter extends Person implements Worker{

	// Constructor 
	public Waiter(String name, int id) {
		super(name, id);
	}
	//method overriding
	@Override
	public void performDuties() {
		System.out.println("Waiter " + name + " is serving food to guests");
	}	

}
