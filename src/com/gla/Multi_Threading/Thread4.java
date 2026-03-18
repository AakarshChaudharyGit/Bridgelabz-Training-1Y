package com.gla.Multi_Threading;

public class Thread4 implements Runnable{
    @Override
    public void run() {
        for(int i=9;i>=1;i--){
            System.out.println("thread4:"+i);
        }
    }

}
