package com.company;

import java.util.Scanner;

public class CWH13_ch03_STRING {
    public static void main(String[] args) {
//        String name=new String("Prashant Joshi");
        String name="Prashant Joshi";
//        System.out.println(name);

        Scanner sc=new Scanner(System.in);
        int a=65;
        float b=9.34f;
//        System.out.println((char) (a+b))
        System.out.printf("Value of b is %.10f",b);
        name=sc.nextLine();
        System.out.format(name);
    }
}
