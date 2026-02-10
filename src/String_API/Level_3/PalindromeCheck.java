package String_API.Level_3;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        boolean p1 = true;
        int s = 0, e = text.length() - 1;
        while (s < e) {
            if (text.charAt(s) != text.charAt(e)) {
                p1 = false;
                break;
            }
            s++;
            e--;
        }

        char[] a = text.toCharArray();
        char[] r = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            r[i] = text.charAt(a.length - 1 - i);
        }

        boolean p3 = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != r[i]) {
                p3 = false;
                break;
            }
        }

        System.out.println(p1);
        System.out.println(p3);
    }
}
