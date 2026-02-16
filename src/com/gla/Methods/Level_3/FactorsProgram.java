package com.gla.Methods.Level_3;

public class FactorsProgram {
    public static void main(String[] args) {

        int number = 12;

        int[] factors = getFactors(number);

        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Product of Cube of Factors: " + cubeProduct(factors));
    }

    // (a) Find factors using 2 loops
    public static int[] getFactors(int n) {

        int count = 0;

        // First loop → count factors
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        // Second loop → store factors
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors[index++] = i;

        return factors;
    }

    // (b) Greatest factor
    public static int greatestFactor(int[] arr) {
        return arr[arr.length - 1];
    }

    // (c) Sum of factors
    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr)
            sum += f;
        return sum;
    }

    // (d) Product of factors
    public static int productFactors(int[] arr) {
        int product = 1;
        for (int f : arr)
            product *= f;
        return product;
    }

    // (e) Product of cube of factors
    public static double cubeProduct(int[] arr) {
        double product = 1;
        for (int f : arr)
            product *= Math.pow(f, 3);
        return product;
    }
}
