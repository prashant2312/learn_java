package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH101_CH15_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime dt=LocalDateTime.now();
//        System.out.println(dt);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy -- E a B");
//        DateTimeFormatter dtf=DateTimeFormatter.BASIC_ISO_DATE;
        String myDate=dtf.format(dt);
        System.out.println(myDate.toString());



    }
}
