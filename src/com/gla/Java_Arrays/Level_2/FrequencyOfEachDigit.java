package com.gla.Java_Arrays.Level_2;
import java.util.Scanner;
public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        int count = 0;
        long temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int[] freq = new int[10];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(num % 10);
            num /= 10;
        }
        for (int d : digits)
            freq[d]++;
        System.out.println("Digit : Frequency");
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println(i + " : " + freq[i]);
    }
}
