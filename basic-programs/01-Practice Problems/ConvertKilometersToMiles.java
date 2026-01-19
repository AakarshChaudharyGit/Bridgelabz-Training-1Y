import java.util.Scanner;
class  ConvertKilometersToMiles{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter Kilometers:"); 
	   double kilometers = sc.nextDouble();
	   double miles = kilometers * 0.621371;
	   System.out.println("Miles = "+miles);
	}
}