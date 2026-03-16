package com.gla.interfaces_Assignment_10.FUNCTIONAL_INTERFACES;
import java.util.function.Function;

public class StringLengthCheckerMain {
    public static void main(String[] args) {
        Function<String, Integer> len = s -> s.length();
        System.out.println(len.apply("Hello Java"));
    }
}
