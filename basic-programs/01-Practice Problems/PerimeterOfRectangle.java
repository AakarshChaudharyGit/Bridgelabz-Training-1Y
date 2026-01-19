import java.util.Scanner;
class PerimeterOfRectangle{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Length:"); 
	   double length = sc.nextDouble();
	   System.out.print("Enter Width:"); 
	   double width = sc.nextDouble();
	   double Perimeter = 2 * (length + width);
	   System.out.println("Perimeter Of a Rectangle = "+Perimeter);
	}
}