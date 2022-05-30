package com.company;

import java.util.Scanner;

public class CWH34_CH_07_Recursion {
    static int z=0;
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int fibonacci(int a ,int b){
        int c,temp=0,n=1;


            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

 z=z+1;
    if(z==10){
        return 1;
    }
    else{
        return fibonacci(a, b);
    }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(factorial(n));
        fibonacci(0,1);
    }
}
