package com.gla.generics;

public class Ex2 {

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue(); // fixed
    }

    public static void main(String[] args) {  // must be public
        System.out.println(add(5, 7));
        System.out.println(add(5.5, 2.3));
    }
}
