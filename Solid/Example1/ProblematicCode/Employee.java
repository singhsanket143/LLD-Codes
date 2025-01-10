package Solid.Example1.ProblematicCode;

public class Employee {

    private int id; // Employee ID
    private String name; // Employee Name
    private String address; // Employee Address

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport() {
        // Code to print performance report
        System.out.println("Performance report of employee: " + name);
    }

    public double computeSalary() {
        // Code to compute salary
        return 1000.0;
    }

    public void updateEmployeeData() {
        // Code to update employee data
        System.out.println("Employee data updated successfully");
    }

    public void fetchEmployeeData() {
        // Code to fetch employee data
        System.out.println("Employee data fetched successfully");
    }

}