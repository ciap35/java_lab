package com.java.laboratory.practices;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar); //Gregorian Calendar.
        System.out.println("CalendarType = " + calendar.getCalendarType());
        System.out.println("getTime = " + calendar.getTime());
        System.out.println("getTimeZone = " + calendar.getTimeZone());
        System.out.println("getTimeZone().zoneId() = " + calendar.getTimeZone().toZoneId());
        System.out.println("getTimeZone().getDisplayName() = " + calendar.getTimeZone().getDisplayName());
        System.out.println("getTimeInMillis = " + calendar.getTimeInMillis());
    }
}
