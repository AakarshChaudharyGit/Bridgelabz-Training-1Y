package com.gla.Methods.Level_2;

public class RandomNumbers {
    public static void main(String[] args) {

        int[] numbers = generate4DigitRandomArray(5);

        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        double[] results = findAverageMinMax(numbers);

        System.out.println("\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }

    // Method to generate 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000;
            // Generates number between 1000 and 9999
        }

        return arr;
    }

    // Method to find average, min and max
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {

            sum += num;

            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }
}
