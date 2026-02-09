package String_API.Level_1;
import java.util.Scanner;
public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            text.charAt(text.length());
        } catch (Exception e) {
            try {
                text.charAt(text.length());
            } catch (StringIndexOutOfBoundsException ex) {
                System.out.println("Exception Handled");
            }
        }
    }
}
