package com.gla.Encapsulation;
abstract class FoodItem {
    double price, qty;

    FoodItem(double p, double q) {
        price = p;
        qty = q;
    }

    abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    VegItem(double p, double q) { super(p,q); }

    double calculateTotalPrice() {
        return price * qty;
    }
}

class NonVegItem extends FoodItem {
    NonVegItem(double p, double q) { super(p,q); }

    double calculateTotalPrice() {
        return price * qty + 50;
    }
}
public class FoodMain {
    public static void main(String[] args) {
        FoodItem f = new NonVegItem(200, 2);
        System.out.println(f.calculateTotalPrice());
    }
}
