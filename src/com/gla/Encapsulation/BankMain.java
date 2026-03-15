package com.gla.Encapsulation;
abstract class BankAccount {
    private int accNo;
    private double balance;

    public BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int a, double b) {
        super(a, b);
    }

    double calculateInterest() {
        return getBalance() * 0.04;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(int a, double b) {
        super(a, b);
    }

    double calculateInterest() {
        return getBalance() * 0.02;
    }
}
public class BankMain {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount(101, 50000);
        System.out.println(acc.calculateInterest());
    }
}
