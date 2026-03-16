package com.gla.interfaces_Assignment_10.STATIC_METHODS_IN_INTERFACE;
interface SecurityUtils {
    static boolean isStrong(String pass) {
        return pass.length() >= 8;
    }
}

public class SecurityUtilsMain {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrong("java12345"));
    }
}
