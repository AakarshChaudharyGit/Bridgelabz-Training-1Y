import java.util.Scanner;
class VolumeOfCylinder{
    public static void main(String[] args){
	   double pi = Math.PI;
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter radius:"); 
	   double radius = sc.nextDouble();
	   System.out.print("Enter height:"); 
	   double height = sc.nextDouble();
	   double Volume = pi*radius*radius* height;
	   System.out.println("Volume of a cylinder = "+ Volume);
	}
}