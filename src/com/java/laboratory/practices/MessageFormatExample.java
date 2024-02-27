package com.java.laboratory.practices;

import java.text.MessageFormat;

public class MessageFormatExample {
    public static void main(String[] args) {
        messageFormatExample();
    }

    private static void messageFormatExample(){
        printHeader("messageFormatExample");
        String genericMessage = "Hey {0},\n nice to meet you, I heard a lot about you. \n Where did you study {1}? I''d like to reach you for a job. \n\r Kind regards, {2}.";
        String name = "Charles";
        String career = "Computer Systems Engineer";
        String ceo = "John Doe";
        System.out.println(MessageFormat.format(genericMessage,name,career,ceo));
    }
    private static void printHeader(String title){
        System.out.println();
        System.out.println("**************************"+title+"**************************");
    }
}
