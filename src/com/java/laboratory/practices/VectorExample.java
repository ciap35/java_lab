package com.java.laboratory.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
    safeImplementation();
    //unsafeImplementation();
    }

    public static void unsafeImplementation() throws InterruptedException {
        int size = 1000000;
        //Using ArrayList object
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for(int i=0;i<size;i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Added "+size+ " elements to arrayList: "+(end-start)+" ms");

        //Using Vector object
        List<Integer> vector = new Vector<>();
        start = System.currentTimeMillis();

        for(int i=0;i<size;i++){
            vector.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Added "+size+ " elements to vector: "+(end-start)+" ms");
        /*****************************/
        List<Integer> multithreadedList = new ArrayList<>(); //THREAD UNSAFE
        start = System.currentTimeMillis();

        Thread t1 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedList.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedList.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Added elements in a multithreads way to ArrayList: "+(end-start)+" ms");
        System.out.println("Size is: "+multithreadedList.size());

        /*******************************/
        List<Integer> multithreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        Thread t3 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedVector.add(i);
            }
        });

        Thread t4 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedVector.add(i);
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();
        end = System.currentTimeMillis();
        System.out.println("Added elements in a multithreads way to Vector: "+(end-start)+" ms");
        System.out.println("Size is: "+multithreadedVector.size());

        /*******************************/
    }
    public static void safeImplementation() throws InterruptedException {
        int size = 1000000;
        //Using ArrayList object
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for(int i=0;i<size;i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Added "+size+ " elements to arrayList: "+(end-start)+" ms");

        //Using Vector object
        List<Integer> vector = new Vector<>();
        start = System.currentTimeMillis();

        for(int i=0;i<size;i++){
            vector.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Added "+size+ " elements to vector: "+(end-start)+" ms");
        /*****************************/
        List<Integer> multithreadedList = Collections.synchronizedList(new ArrayList<>()); //THREAD SAFE
        start = System.currentTimeMillis();

        Thread t1 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedList.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedList.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Added elements in a multithreads way to ArrayList: "+(end-start)+" ms");
        System.out.println("Size is: "+multithreadedList.size());

        /*******************************/
        List<Integer> multithreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        Thread t3 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedVector.add(i);
            }
        });

        Thread t4 = new Thread(()->{
            for(int i=0;i<size;i++){
                multithreadedVector.add(i);
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();
        end = System.currentTimeMillis();
        System.out.println("Added elements in a multithreads way to Vector: "+(end-start)+" ms");
        System.out.println("Size is: "+multithreadedVector.size());

        /*******************************/
    }

    /*
     * * * * * * * * * * *
     *    LAB's notes    *
     * * * * * * * * * * *
     *
     ArrayList is thread unsafe, it's not syncronized across threads
     * 1 approach to sync multiple threads using arrayList is using a wrapper which is.
     * Collections.syncronizedList(new ArrayList<>());
     * */

}
