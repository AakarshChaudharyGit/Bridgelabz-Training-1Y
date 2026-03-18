package com.gla.Multi_Threading;

public class Thread3 extends Thread{
    public void run(){
        for(int i=1; i<10;i++){
            System.out.println("thread3:"+i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    static void main() {
        Thread3 thread3 = new Thread3();
        thread3.start();

        Thread4 thread4 =new Thread4();
        Thread thread = new Thread(thread4);
        thread.start();
    }
}
