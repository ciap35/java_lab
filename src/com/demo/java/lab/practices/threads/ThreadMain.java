package com.demo.java.lab.practices.threads;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        //##USING THREAD
        //runInParallel();
        //runInOrder();
        //joinThreads();

        //##USING RUNNER
        runnerWithMultipleThreads();
    }

    private static void runInParallel(){
        ThreadWithThreadClass thread1 = new ThreadWithThreadClass(1);
        ThreadWithThreadClass thread2 = new ThreadWithThreadClass(2);  //It will fail when index will be 3 but running still continue.
        //They will run at same time
        thread1.start();
        thread2.start();
    }

    private static void runInOrder(){
        ThreadWithThreadClass thread1 = new ThreadWithThreadClass(1);
        ThreadWithThreadClass thread2 = new ThreadWithThreadClass(2);  //It will fail when index will be 3 but running will stop.
        //They will run at same time
        thread1.run();
        thread2.run(); //will stop at any exception.
    }

    private static void joinThreads() throws InterruptedException {
        ThreadWithThreadClass thread1 = new ThreadWithThreadClass(1);
        ThreadWithThreadClass thread2 = new ThreadWithThreadClass(2);  //It will fail when index will be 3 but running will stop.
        //They will run at same time
        thread1.run();
        thread2.join(5000); //will join after thread1 finish and 5000ms later stop at any exception.
        System.out.println("thread1.isAlive(): "+thread1.isAlive());//will be executed after thread1.run() finish.
    }

    private static void runnerWithMultipleThreads() throws InterruptedException {
        //We create an instance of class wich implement Runner, then create a new Thread and start it and join each thread.
        for(int i=0;i<=3;i++){
            ThreadWithRunner thread = new ThreadWithRunner(i);
            Thread myThread = new Thread(thread);
            myThread.start();
            myThread.join();
            System.out.println("thread.isAlive(): "+myThread.isAlive());//will be executed after thread1.run() finish.

        }

    }
}
