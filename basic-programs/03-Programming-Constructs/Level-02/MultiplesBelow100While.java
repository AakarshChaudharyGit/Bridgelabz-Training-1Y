import java.util.Scanner;

class MultiplesBelow100While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 0 && number < 100){
            int i = 100;
            while(i >= 1){
                if(i % number == 0){
                    System.out.println(i);
                }
                i--;
            }
        } else {
            System.out.println("Enter number between 1 and 99");
        }
    }
}