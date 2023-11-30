package com.demo.java.lab.practices.threads;

public class ThreadWithThreadClass extends Thread{
    //Note: Runnable is an interface, which make our class more extendible, more flexible instead extend a class Thread
    private int id;

    public ThreadWithThreadClass(int id){
        this.id = id;
    }

    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            if(id==2 && i==3){
                throw new RuntimeException();
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
