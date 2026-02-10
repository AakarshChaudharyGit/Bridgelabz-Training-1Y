package String_API.Level_3;
import java.util.Scanner;
public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] months = {
                "January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };

        int[] daysInMonth = {
                31,28,31,30,31,30,31,31,30,31,30,31
        };

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (leap && month == 2) {
            daysInMonth[1] = 29;
        }

        int d = 1;
        int m = month;
        int y = year;

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println(months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < d0; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            System.out.printf("%3d ", day);
            if ((day + d0) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
