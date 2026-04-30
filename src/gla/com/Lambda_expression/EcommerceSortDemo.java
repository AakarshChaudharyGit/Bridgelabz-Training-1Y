package gla.com.Lambda_expression;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    public Product(String n, double p, double r) {
        name = n; price = p; rating = r;
    }

    public String toString() {
        return name + " ₹" + price + " ⭐" + rating;
    }
}

public class EcommerceSortDemo {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 60000, 4.5));
        list.add(new Product("Phone", 30000, 4.2));
        list.add(new Product("Tablet", 20000, 4.8));

        // Sort by price
        list.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sort by Price: " + list);

        // Sort by rating
        list.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("Sort by Rating: " + list);
    }
}
