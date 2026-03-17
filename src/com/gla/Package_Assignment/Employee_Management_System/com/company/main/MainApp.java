package com.gla.Package_Assignment.Employee_Management_System.com.company.main;
import com.gla.Package_Assignment.Employee_Management_System.com.company.hr.*;
import com.gla.Package_Assignment.Employee_Management_System.com.company.payroll.*;
public class MainApp {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Aakarsh","IT",50000);
        Payroll p = new Payroll();

        p.calculateBonus(e);
        e.display();
    }
}
