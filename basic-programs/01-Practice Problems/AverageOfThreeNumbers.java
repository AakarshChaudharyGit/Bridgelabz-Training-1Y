import java.util.Scanner;
class AverageOfThreeNumbers{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter 1st number:"); 
	   double num1 = sc.nextDouble();
	   System.out.print("Enter 2nd number:"); 
	   double num2 = sc.nextDouble();
	   System.out.print("Enter 3rd number:"); 
	   double num3 = sc.nextDouble();
	   double Average = (num1 + num2 + num3)/3;
	   System.out.println("Average Of Three Numbers = "+Average);
	}
}