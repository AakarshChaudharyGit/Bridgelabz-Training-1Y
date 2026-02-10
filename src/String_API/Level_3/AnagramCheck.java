package String_API.Level_3;
import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        int[] f1 = new int[256];
        int[] f2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            f1[s1.charAt(i)]++;
            f2[s2.charAt(i)]++;
        }

        boolean result = true;
        for (int i = 0; i < 256; i++) {
            if (f1[i] != f2[i]) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
