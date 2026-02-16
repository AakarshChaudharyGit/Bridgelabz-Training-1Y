package com.gla.Methods.Level_3;
import java.util.Scanner;
public class StudentScorecard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generatePCMScores(n);
        double[][] results = calculateResults(pcmScores);

        displayScorecard(pcmScores, results);

        sc.close();
    }

    // (b) Generate Random 2-Digit PCM Scores
    public static int[][] generatePCMScores(int n) {

        int[][] scores = new int[n][3];
        // 0 → Physics
        // 1 → Chemistry
        // 2 → Maths

        for (int i = 0; i < n; i++) {

            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }

        return scores;
    }

    // (c) Calculate Total, Average, Percentage
    public static double[][] calculateResults(int[][] scores) {

        double[][] result = new double[scores.length][3];
        // 0 → Total
        // 1 → Average
        // 2 → Percentage

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // (d) Display Scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {

        System.out.println("\nRoll\tPhy\tChem\tMath\tTotal\tAvg\t%\n");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i + 1) + "\t"
                    + scores[i][0] + "\t"
                    + scores[i][1] + "\t"
                    + scores[i][2] + "\t"
                    + results[i][0] + "\t"
                    + results[i][1] + "\t"
                    + results[i][2]);
        }
    }
}
