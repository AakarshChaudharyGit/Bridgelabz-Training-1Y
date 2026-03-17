package com.gla.Package_Assignment.Employee_Management_System.com.company.payroll;
import com.gla.Package_Assignment.Employee_Management_System.com.company.hr.Employee;
public class Payroll {
    public void calculateBonus(Employee e) {
        double newSalary = e.getSalary() * 1.10;
        e.setSalary(newSalary);
    }
}
