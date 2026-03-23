package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Unchecked_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
