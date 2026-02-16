package com.gla.Methods.Level_3;

public class NumberCheckerQ2 {
    public static void main(String[] args) {

        int number = 153;

        int count = countDigits(number);
        int[] digits = getDigits(number);

        System.out.println("Digit Count: " + count);
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number, digits));

        int[] large = largestTwo(digits);
        System.out.println("Largest: " + large[0] + ", Second Largest: " + large[1]);

        int[] small = smallestTwo(digits);
        System.out.println("Smallest: " + small[0] + ", Second Smallest: " + small[1]);
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

    public static boolean isDuck(int[] arr) {
        for (int d : arr)
            if (d == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int n, int[] arr) {
        int sum = 0;
        int power = arr.length;
        for (int d : arr)
            sum += Math.pow(d, power);
        return sum == n;
    }

    public static int[] largestTwo(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        return new int[]{largest, second};
    }

    public static int[] smallestTwo(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                second = smallest;
                smallest = num;
            } else if (num < second && num != smallest) {
                second = num;
            }
        }
        return new int[]{smallest, second};
    }
}
