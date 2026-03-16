package com.gla.interfaces_Assignment_10.Defining_and_Implementing_Interfaces;
interface Rental {
    void rent();
    void returnVehicle();
}

class Car implements Rental {
    public void rent() { System.out.println("Car rented"); }
    public void returnVehicle() { System.out.println("Car returned"); }
}

class Bus implements Rental {
    public void rent() { System.out.println("Bus rented"); }
    public void returnVehicle() { System.out.println("Bus returned"); }
}

public class VehicleRentalInterfaceMain {
    public static void main(String[] args) {
        Rental r = new Bus();
        r.rent();
        r.returnVehicle();
    }
}
