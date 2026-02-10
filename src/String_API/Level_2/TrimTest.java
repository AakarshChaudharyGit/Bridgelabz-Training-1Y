package String_API.Level_2;
import java.util.Scanner;
public class TrimTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int start = 0;
        int end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        String builtIn = text.trim();
        System.out.println(result.equals(builtIn));
    }
}
