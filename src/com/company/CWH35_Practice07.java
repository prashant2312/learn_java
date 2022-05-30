package com.company;

import java.util.Scanner;

public class CWH35_Practice07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number whose table you want to print");
//        int number=sc.nextInt();
//        for (int i=1;i<=20;i++){
//            System.out.println(number+ " X " +i+ " = "+number*i);
//        }


//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                if (j>=3-i&&j<=1+i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }

//        int sums=sum(2);
//        System.out.println(sums);


//        System.out.println(avg(1,2,3,4,5,6));




    }

    static float avg(int ...args){
        int sum=0;
        for (int e:
             args) {
            sum=sum+e;
        }
        int len=args.length;
        float avgs;
        avgs=(float)sum/len;
        return avgs;
    }

    private static int sum(int n) {
        int sums;
        if (n > 0) {
            return n + sum(n - 1);
        }
       else{
           return 0;
        }
    }
}
