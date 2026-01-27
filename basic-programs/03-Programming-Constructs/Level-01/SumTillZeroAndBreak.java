import java.util.Scanner;

class SumTillZeroAndBreak{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total = 0;

        while(true){
            double num = sc.nextDouble();

            if(num <= 0){
                break;
            }

            total = total + num;
        }

        System.out.println("Total sum is " + total);
    }
}