package com.gla.Exception_handling;

public class Throw {
    public static void main(String[] args) {
        int age = 16;
        if(age<18){
            throw new ArithmeticException("Not eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
}
