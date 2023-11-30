package com.demo.java.lab.practices.threads;

public class ThreadWithRunner implements Runnable{
    //Note: Runnable is an interface, which make our class more extendible, more flexible instead extend a class Thread

    private int threadNumber;
    public ThreadWithRunner(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
         System.out.println("Iteration "+i+ " from thread "+threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
