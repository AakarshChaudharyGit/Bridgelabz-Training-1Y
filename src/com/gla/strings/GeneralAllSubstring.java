package com.gla.strings;

public class GeneralAllSubstring {
    public static void main(String[] args) {
        String str = "Hello";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}

