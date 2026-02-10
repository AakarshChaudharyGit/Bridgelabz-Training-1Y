package String_API.Level_2;
import java.util.Scanner;
public class ShortLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String shortest = "";
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            int c = 0;
            try {
                while (true) {
                    words[i].charAt(c);
                    c++;
                }
            } catch (Exception e) {
            }

            if (c < min) {
                min = c;
                shortest = words[i];
            }
            if (c > max) {
                max = c;
                longest = words[i];
            }
        }

        System.out.println("Shortest: " + shortest);
        System.out.println("Longest: " + longest);
    }
}
