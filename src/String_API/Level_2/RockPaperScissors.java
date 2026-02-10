package String_API.Level_2;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        int userWin = 0;
        int compWin = 0;

        for (int i = 0; i < games; i++) {
            int user = sc.nextInt();
            int comp = (int)(Math.random() * 3);

            if (user == comp) {
            } else if ((user==0 && comp==2)||(user==1 && comp==0)||(user==2 && comp==1)) {
                userWin++;
            } else {
                compWin++;
            }
        }

        double up = (userWin * 100.0) / games;
        double cp = (compWin * 100.0) / games;

        System.out.println("User Wins\t" + userWin);
        System.out.println("Computer Wins\t" + compWin);
        System.out.println("User %\t" + up);
        System.out.println("Computer %\t" + cp);
    }
}
