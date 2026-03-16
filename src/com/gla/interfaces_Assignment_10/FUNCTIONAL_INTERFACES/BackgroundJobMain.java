package com.gla.interfaces_Assignment_10.FUNCTIONAL_INTERFACES;

public class BackgroundJobMain {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Job Running");
        new Thread(job).start();
    }
}

