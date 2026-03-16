package com.gla.interfaces_Assignment_10.FUNCTIONAL_INTERFACES;
import java.util.function.Predicate;

public class TemperatureAlertMain {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 35;
        System.out.println(alert.test(40.0));
    }
}