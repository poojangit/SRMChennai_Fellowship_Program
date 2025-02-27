package com.bridgelabz.accessmodifiers;

public class AccessModifierExample {
	public int publicVariable = 10; // Accessible everywhere
	protected int protectedVariable = 20; // accessible in the same package and subclasses
	int defaultVariable = 30; // accessible in the same package
    private int privateVariable = 40; // accessible only within the class
    
    void displayAccess() {
    	System.out.println("Public : " + publicVariable);
    	System.out.println("Protected : " + protectedVariable);
    	System.out.println("default : " + defaultVariable);
    	System.out.println("private : " + privateVariable);
    }
    public static void main(String[] args) {
		AccessModifierExample accessCheck = new AccessModifierExample();
		accessCheck.displayAccess();
	}
}
