package String_API.Level_1;
import java.util.Scanner;
public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            text.substring(5, 2);
        } catch (Exception e) {
            try {
                text.substring(5, 2);
            } catch (IllegalArgumentException ex) {
                System.out.println("IllegalArgumentException Handled");
            } catch (RuntimeException ex2) {
                System.out.println("RuntimeException Handled");
            }
        }
    }
}
