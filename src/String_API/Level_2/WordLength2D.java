package String_API.Level_2;
import java.util.Scanner;
public class WordLength2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
        }

        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];
        int idx = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }
        words[idx] = temp;

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int c = 0;
            try {
                while (true) {
                    words[i].charAt(c);
                    c++;
                }
            } catch (Exception e) {
            }
            table[i][0] = words[i];
            table[i][1] = String.valueOf(c);
        }

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}