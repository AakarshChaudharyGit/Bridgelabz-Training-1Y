package com.gla.Methods.Level_3;

public class NumberCheckerQ3 {
    public static void main(String[] args) {

        int number = 21;

        int count = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("Digit Count: " + count);
        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);

        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++)
            if (freq[i][1] != 0)
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1]);
    }

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int sumDigits(int[] arr) {
        int sum = 0;
        for (int d : arr)
            sum += d;
        return sum;
    }

    public static double sumSquares(int[] arr) {
        double sum = 0;
        for (int d : arr)
            sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n, int[] arr) {
        return n % sumDigits(arr) == 0;
    }

    public static int[][] digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int d : arr)
            freq[d][1]++;

        return freq;
    }
}
