package String_API.Level_2;
import java.util.Scanner;
public class SplitCompare {
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

        String[] words1 = new String[spaces + 1];
        int index = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words1[index++] = temp;
                temp = "";
            } else {
                temp = temp + text.charAt(i);
            }
        }
        words1[index] = temp;

        String[] words2 = text.split(" ");

        boolean result = true;
        if (words1.length != words2.length) {
            result = false;
        } else {
            for (int i = 0; i < words1.length; i++) {
                if (!words1[i].equals(words2[i])) {
                    result = false;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}