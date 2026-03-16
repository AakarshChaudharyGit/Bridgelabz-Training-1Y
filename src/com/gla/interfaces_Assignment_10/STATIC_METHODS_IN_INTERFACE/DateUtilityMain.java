package com.gla.interfaces_Assignment_10.STATIC_METHODS_IN_INTERFACE;
import java.time.LocalDate;

interface DateUtil {
    static String format(LocalDate d) {
        return d.toString();
    }
}

public class DateUtilityMain {
    public static void main(String[] args) {
        System.out.println(DateUtil.format(LocalDate.now()));
    }
}

