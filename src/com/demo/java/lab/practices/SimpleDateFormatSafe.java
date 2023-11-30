package com.demo.java.lab.practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleDateFormatSafe {
    //private static final SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

    public static void main(String[] args){
        String dateString = "2020-10-17T12:34:51";

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                try{
                Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(dateString);
                System.out.println("Successfully parsed: "+date);
                } catch (Exception e){
                    System.out.println("Exception: ");
                    e.printStackTrace();
                }
            }
        };

        for(int i=0; i<10;i++){
            executorService.submit(runnable);
        }
        executorService.shutdown();
    }
}

/*
* * * * * * * * * * *
*    LAB's notes    *
* * * * * * * * * * *
* In the previous class: SimpleDateFormatUnsafe, the static global variable is unsafe using multiple threads.
* So to implement safe using acrosss multiple threads we just need to coment this static variable and just declare the simpledateformat in the runner every time it runs
* */
