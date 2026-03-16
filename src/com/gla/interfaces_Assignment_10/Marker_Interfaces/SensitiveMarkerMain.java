package com.gla.interfaces_Assignment_10.Marker_Interfaces;
interface Sensitive {}

class User implements Sensitive {}

public class SensitiveMarkerMain {
    public static void main(String[] args) {
        User u = new User();

        if (u instanceof Sensitive)
            System.out.println("Encrypt this data");
    }
}

