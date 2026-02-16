package com.gla.Methods.Level_3;

public class OTPGenerator {
    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTP 10 times
        for (int i = 0; i < 10; i++)
            otps[i] = generateOTP();

        System.out.println("Generated OTPs:");
        for (int otp : otps)
            System.out.println(otp);

        System.out.println("All OTPs Unique: " + areUnique(otps));
    }

    // (a) Generate 6-digit OTP
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // (c) Check uniqueness
    public static boolean areUnique(int[] arr) {

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j])
                    return false;

        return true;
    }
}
