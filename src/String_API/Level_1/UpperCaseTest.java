package String_API.Level_1;
import java.util.Scanner;
public class UpperCaseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String s1 = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - 32);
            }
            s1 = s1 + c;
        }

        String s2 = text.toUpperCase();

        boolean result = true;
        if (s1.length() != s2.length()) {
            result = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
