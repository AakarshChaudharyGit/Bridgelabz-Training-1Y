package com.gla.Encapsulation;
abstract class Patient {
    String name;

    Patient(String n) { name = n; }

    abstract double calculateBill();
}

class InPatient extends Patient {
    InPatient(String n) { super(n); }

    double calculateBill() { return 5000; }
}

class OutPatient extends Patient {
    OutPatient(String n) { super(n); }

    double calculateBill() { return 1000; }
}

public class HospitalMain {
    public static void main(String[] args) {
        Patient p = new InPatient("Raj");
        System.out.println(p.calculateBill());
    }
}
