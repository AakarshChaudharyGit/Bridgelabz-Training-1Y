package com.gla.Methods.Level_3;

public class NumberCheckerQ4 {
    public static void main(String[] args) {

        int number = 121;

        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.println("Palindrome: " + isPalindrome(digits, reversed));
        System.out.println("Duck Number: " + isDuck(digits));
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int[] arr, int[] rev) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != rev[i])
                return false;
        return true;
    }

    public static boolean isDuck(int[] arr) {
        for (int d : arr)
            if (d == 0)
                return true;
        return false;
    }
}
