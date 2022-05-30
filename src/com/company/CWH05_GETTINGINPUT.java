package com.company;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CWH05_GETTINGINPUT {
    public static void main(String[] a) throws IOException {
//        System.out.println("It works!!");
        Scanner sc=new Scanner(System.in);//instance variable
//        System.out.print("Enter number 1 :- ");
////        int a1=sc.nextInt();
//        float a1=sc.nextFloat();
//        System.out.print("Enter number 2 :- ");
//        int b=sc.nextInt();
//        System.out.println("The sum of these two numbers is "+(a1+b));
//        String str=sc.nextLine();
//        System.out.println(str);

//        String ch=sc.nextLine();
//        System.out.println(st);
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        //Reading character data
        int data = obj.read();
        System.out.println(data);
    }
}
