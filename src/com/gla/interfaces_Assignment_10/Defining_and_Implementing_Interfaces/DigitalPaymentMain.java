package com.gla.interfaces_Assignment_10.Defining_and_Implementing_Interfaces;
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid via Wallet: " + amount);
    }
}

public class DigitalPaymentMain {
    public static void main(String[] args) {
        Payment p = new Wallet();
        p.pay(1000);
    }
}
