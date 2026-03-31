package gla.com.Threads;

class BankAccount implements Runnable {
    String accountHolder;
    String type;

    public BankAccount(String name, String type) {
        this.accountHolder = name;
        this.type = type;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " (" + type + ") checking balance | Priority: " +
                    Thread.currentThread().getPriority());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("Aakarsh", "Premium"), "User-1");
        Thread regular = new Thread(new BankAccount("Rohit", "Regular"), "User-2");
        Thread basic = new Thread(new BankAccount("Aman", "Basic"), "User-3");

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}
