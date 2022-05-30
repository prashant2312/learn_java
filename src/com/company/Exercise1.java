package com.company;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float total_marks=100;
        System.out.println("Enter subject 1 marks :- ");
        float m1=sc.nextFloat();
        System.out.println("Enter subject 2 marks :- ");
        float m2=sc.nextFloat();
        System.out.println("Enter subject 3 marks :- ");
        float m3=sc.nextFloat();
        System.out.println("Enter subject 4 marks :- ");
        float m4=sc.nextFloat();
        System.out.println("Enter subject 5 marks :- ");
        float m5=sc.nextFloat();
        total_marks=(m1+m2+m5+m3+m4+m5)/5;
        System.out.println(total_marks);
    }
}
