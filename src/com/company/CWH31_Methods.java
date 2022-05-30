package com.company;

public class CWH31_Methods {
    static int z=1000;
     static int logic(int a, int b){
        int c;
        if (a>b){
            c=a+b;
            return  c;
        }
        else{
            c=(a+b)*5;
            return c;
        }
     }
    public static void main(String[] args) {
        int a=5,b=6;
     int c=logic(a,b);//here a,b are parameter
        System.out.println(c);
        int a1=10;
        int b1=4;

        int c1=logic(a1,b1);
        System.out.println(c1);
        System.out.println(z);
    }
}
