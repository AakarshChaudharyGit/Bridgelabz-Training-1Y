import java.util.Scanner;

class FactorialWhile{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            int fact = 1;
            int i = 1;

            while(i <= num){
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial is " + fact);
        } else {
            System.out.println("Enter a positive number");
        }
    }
}