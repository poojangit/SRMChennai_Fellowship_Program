package com.bridgelabz.accessmodifiers;

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "IT", 50000.0);
        emp1.displayEmployeeDetails();

        // Modifying salary
        emp1.setSalary(55000.0);

        // Creating a Manager object
        Manager mgr1 = new Manager(201, "HR", 75000.0, "Recruitment");
        mgr1.displayManagerDetails();
    }
}