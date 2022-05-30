package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CWH99_CH15_GregorianCalender {
    public static void main(String[] args) {
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.DATE));


        GregorianCalendar cal=new GregorianCalendar();
        System.out.println(cal.isLeapYear(2022));
        for (int i=0;i<TimeZone.getAvailableIDs().length;i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
