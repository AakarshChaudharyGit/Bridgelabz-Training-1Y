import java.util.Scanner;

class AreaOfTriangle{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("Area of triangle in square centimeters is " + areaCm +
                           " and in square inches is " + areaInches);
    }
}