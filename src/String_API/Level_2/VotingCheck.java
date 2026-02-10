package String_API.Level_2;
import java.util.Scanner;
public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (age[i] >= 18)
                System.out.println(age[i] + "\ttrue");
            else
                System.out.println(age[i] + "\tfalse");
        }
    }
}