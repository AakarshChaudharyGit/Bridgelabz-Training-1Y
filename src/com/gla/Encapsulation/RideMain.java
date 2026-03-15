package com.gla.Encapsulation;
abstract class RideVehicle {
    double rate;

    RideVehicle(double r) { rate = r; }

    abstract double calculateFare(double d);
}

class CarRide extends RideVehicle {
    CarRide(double r) { super(r); }

    double calculateFare(double d) { return d * rate; }
}

class BikeRide extends RideVehicle {
    BikeRide(double r) { super(r); }

    double calculateFare(double d) { return d * rate; }
}
public class RideMain {
    public static void main(String[] args) {
        RideVehicle v = new CarRide(15);
        System.out.println(v.calculateFare(10));
    }
}
