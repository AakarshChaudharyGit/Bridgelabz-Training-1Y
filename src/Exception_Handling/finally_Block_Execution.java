package Exception_Handling;
import java.util.Scanner;
public class finally_Block_Execution {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int div = num1/num2;
        try{
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
        System.out.println("Operation completed");
        }
    }
}
