package String_API.Level_1;
import java.util.Scanner;
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            Integer.parseInt(text);
        } catch (Exception e) {
            try {
                Integer.parseInt(text);
            } catch (NumberFormatException ex) {
                System.out.println("NumberFormatException Handled");
            } catch (RuntimeException ex2) {
                System.out.println("RuntimeException Handled");
            }
        }
    }
}
