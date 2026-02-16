package com.gla.Methods.Level_2;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3]; // weight, height(cm), BMI
        String[] status = new String[10];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Get BMI Status
        status = getBMIStatus(data);

        // Display Results
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s\n",
                    data[i][1], data[i][0], data[i][2], status[i]);
        }

        sc.close();
    }

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < 10; i++) {

            double heightInMeters = data[i][1] / 100; // convert cm to meters
            double bmi = data[i][0] / (heightInMeters * heightInMeters);

            data[i][2] = bmi; // store BMI in 3rd column
        }
    }

    // Method to determine BMI Status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {

            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }
}
