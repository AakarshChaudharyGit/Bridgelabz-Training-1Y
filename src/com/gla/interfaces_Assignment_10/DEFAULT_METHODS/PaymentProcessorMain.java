package com.gla.interfaces_Assignment_10.DEFAULT_METHODS;
interface PaymentProcessor {
    void pay();

    default void refund() {
        System.out.println("Refund done");
    }
}

class Razorpay implements PaymentProcessor {
    public void pay() {
        System.out.println("Payment done");
    }
}

public class PaymentProcessorMain {
    public static void main(String[] args) {
        PaymentProcessor p = new Razorpay();
        p.refund();
    }
}

