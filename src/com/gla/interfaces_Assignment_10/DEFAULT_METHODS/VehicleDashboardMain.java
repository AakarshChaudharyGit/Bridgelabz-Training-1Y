package com.gla.interfaces_Assignment_10.DEFAULT_METHODS;
interface Dashboard {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery 80%");
    }
}

class ElectricCar implements Dashboard {
    public void displaySpeed() {
        System.out.println("Speed 60");
    }
}

public class VehicleDashboardMain {
    public static void main(String[] args) {
        Dashboard d = new ElectricCar();
        d.displayBattery();
    }
}
