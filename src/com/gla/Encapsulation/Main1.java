package com.gla.Encapsulation;
import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    Employee(int id, String name, double salary) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println(employeeId + " " + name);
    }
}

interface Department {
    void assignDepartment(String dept);
    void getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    String dept;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() {
        return baseSalary;
    }

    public void assignDepartment(String d) { dept = d; }
    public void getDepartmentDetails() {
        System.out.println("Dept: " + dept);
    }
}

class PartTimeEmployee extends Employee implements Department {
    int hours;
    String dept;

    PartTimeEmployee(int id, String name, double salary, int hours) {
        super(id, name, salary);
        this.hours = hours;
    }

    double calculateSalary() {
        return baseSalary * hours;
    }

    public void assignDepartment(String d) { dept = d; }
    public void getDepartmentDetails() {
        System.out.println("Dept: " + dept);
    }
}
public class Main1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee(1,"Rahul",50000));
        list.add(new PartTimeEmployee(2,"Aman",500,5));

        for(Employee e : list){
            e.displayDetails();
            System.out.println("Salary: " + e.calculateSalary());
        }
    }
}
