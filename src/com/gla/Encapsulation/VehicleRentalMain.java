package com.gla.Encapsulation;
import java.util.*;

abstract class Vehicle {
    protected String number;
    protected double rate;

    public Vehicle(String number, double rate) {
        this.number = number;
        this.rate = rate;
    }

    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {
    public Car(String n, double r) {
        super(n, r);
    }

    double calculateRentalCost(int days) {
        return days * rate;
    }

    public double calculateInsurance() {
        return 500;
    }
}

class Bike extends Vehicle {
    public Bike(String n, double r) {
        super(n, r);
    }

    double calculateRentalCost(int days) {
        return days * rate;
    }
}
public class VehicleRentalMain {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Car("UP21", 2000));
        list.add(new Bike("UP22", 500));

        for (Vehicle v : list) {
            System.out.println(v.calculateRentalCost(5));
        }
    }
}
