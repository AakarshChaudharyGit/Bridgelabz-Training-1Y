import java.util.Scanner;

class SumOfnNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0){
            int sumFormula = n * (n + 1) / 2;

            int sumLoop = 0;
            int i = 1;
            while(i <= n){
                sumLoop = sumLoop + i;
                i++;
            }

            System.out.println("Sum using formula = " + sumFormula);
            System.out.println("Sum using while loop = " + sumLoop);
        } else {
            System.out.println("Not a natural number");
        }
    }
}