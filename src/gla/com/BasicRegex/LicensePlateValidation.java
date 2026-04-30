package gla.com.BasicRegex;

public class LicensePlateValidation {
    public static void main(String[] args) {
        String plate = "AB1234";

        String regex = "^[A-Z]{2}\\d{4}$";

        System.out.println(plate.matches(regex) ? "Valid" : "Invalid");
    }
}
