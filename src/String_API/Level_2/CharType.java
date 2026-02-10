package String_API.Level_2;
import java.util.Scanner;
public class CharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            char temp = ch;
            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    System.out.println(temp + "\tVowel");
                else
                    System.out.println(temp + "\tConsonant");
            } else {
                System.out.println(temp + "\tNot a Letter");
            }
        }
    }
}
