package Solid.Example1.BetterCode;
// This class follows SRP as it only contains the Employee class
public class Employee {
    private int id; // Employee ID
    private String name; // Employee Name
    private String address; // Employee Address

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getEmployeeId() {
        return id;
    }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeeAddress() {
        return address;
    }

    public void setEmployeeAddress(String address) {
        this.address = address;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }
}
