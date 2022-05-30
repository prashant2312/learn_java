package com.company;

public class CWH33_CH07_VarArgs {
//    static int sum(int a , int b){
//        return a+b;
//    }
//    static int sum(int a , int b,int c) {
//        return a + b + c;
//    }
//    static int sum(int a , int b,int c,int d){
//        return a+b+c+d;
//    }

   static int sum(int b,int... a){
        int res=b;
        for(int e:a){
            res+=e;
//            System.out.println(e);

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("welcome to var args tutorial");
        System.out.println("Sum of nothing is "+sum(1));
        System.out.println("Sum of 4 and 5 is "+sum(4,5));
        System.out.println("Sum of 3 , 4 and 5 is "+sum(3,4,5));
        System.out.println("Sum of 2 , 3 , 4 and 5 is "+sum(2,3,4,5));
    }
}
