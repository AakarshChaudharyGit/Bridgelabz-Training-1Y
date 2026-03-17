package com.gla.Package_Assignment.Employee_Management_System.com.company.hr;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void display() {
        System.out.println(id + " " + name + " " + dept + " " + salary);
    }
}
