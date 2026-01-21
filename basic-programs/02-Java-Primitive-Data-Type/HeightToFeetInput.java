import java.util.Scanner;

class HeightToFeetInput{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double heightCm = sc.nextDouble();

        double inches = heightCm / 2.54;
        double feet = inches / 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}