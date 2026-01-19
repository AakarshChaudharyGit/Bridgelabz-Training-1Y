import java.util.Scanner;
class AreaOfCircle{
    public static void main(String[] args){
        double pi = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();   // changed input part only
        double area = pi*radius*radius;
        System.out.println("Area of Circle ="+area);
    }
}