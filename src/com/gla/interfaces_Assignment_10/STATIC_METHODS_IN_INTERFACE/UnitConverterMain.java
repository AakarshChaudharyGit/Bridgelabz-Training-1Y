package com.gla.interfaces_Assignment_10.STATIC_METHODS_IN_INTERFACE;
interface Converter {
    static double kmToMiles(double km) {
        return km * 0.62;
    }
}

public class UnitConverterMain {
    public static void main(String[] args) {
        System.out.println(Converter.kmToMiles(10));
    }
}
