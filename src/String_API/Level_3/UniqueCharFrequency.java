package String_API.Level_3;
import java.util.Scanner;
public class UniqueCharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean done = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    done = true;
                    break;
                }
            }
            if (!done) {
                System.out.println(c + " " + freq[c]);
            }
        }
    }
}
