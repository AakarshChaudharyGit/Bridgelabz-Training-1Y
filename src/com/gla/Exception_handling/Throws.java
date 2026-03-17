package com.gla.Exception_handling;

public class Throws {
    public static void divide(int a, int b) throws ArithmeticException{
        int c =a/b;
        System.out.println(c);
    }

    static void main(String[] args) {
        try {
            divide(10, 0);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
