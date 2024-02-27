package com.java.laboratory.practices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormatted = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateTimeFormatted = new SimpleDateFormat("dd/MM/yyyy HH:mm:sss a");
        SimpleDateFormat dateTimeFormattedWithMilis = new SimpleDateFormat("dd/MM/yyyy HH:mm:sss:SSS a");
        //date = Fri Feb 09 10:18:35 COT 2024
        System.out.println("date = " + date);
        //13/12/2024
        System.out.println("simpleDateFormat dd MMMM yyyyy = " + dateFormatted.format(date));
        System.out.println("dateTimeFormatted dd/MM/yyyy HH:mm:sss a = " + dateTimeFormatted.format(date));
        System.out.println("dateTimeFormatted dd/MM/yyyy HH:mm:sss:SSS a = " + dateTimeFormattedWithMilis.format(date));
    }
}