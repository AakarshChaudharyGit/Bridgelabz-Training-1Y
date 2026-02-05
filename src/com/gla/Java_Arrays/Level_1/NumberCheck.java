package com.gla.Java_Arrays.Level_1;
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Checking numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is positive and even");
                } else {
                    System.out.println(arr[i] + " is positive and odd");
                }
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println(arr[i] + " is zero");
            }
        }

        // Comparing first and last elements
        if (arr[0] == arr[4]) {
            System.out.println("First and last elements are equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");
        }
    }

}
