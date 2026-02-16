package com.gla.Methods.Level_2;
import java.util.Scanner;
public class FactorsProgram {
    public static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++)
            if (number % i == 0)
                factors[index++] = i;

        return factors;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static int findProduct(int[] arr) {
        int product = 1;
        for (int i : arr) product *= i;
        return product;
    }

    public static double findSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr)
            sum += Math.pow(i, 2);
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors:");
        for (int i : factors)
            System.out.print(i + " ");

        System.out.println("\nSum: " + findSum(factors));
        System.out.println("Product: " + findProduct(factors));
        System.out.println("Sum of Squares: " + findSumOfSquares(factors));
    }
}
