package String_API.Level_2;
import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[][] result = new double[n][3];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 90) + 10;
            marks[i][1] = (int)(Math.random() * 90) + 10;
            marks[i][2] = (int)(Math.random() * 90) + 10;
        }

        for (int i = 0; i < n; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3;
            double percent = (total / 300) * 100;

            total = Math.round(total * 100.0) / 100.0;
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;

            if (percent >= 80)
                grade[i] = 'A';
            else if (percent >= 70)
                grade[i] = 'B';
            else if (percent >= 60)
                grade[i] = 'C';
            else if (percent >= 50)
                grade[i] = 'D';
            else if (percent >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grade[i]
            );
        }
    }
}
