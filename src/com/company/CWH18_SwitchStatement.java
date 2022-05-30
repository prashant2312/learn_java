package com.company;

import java.util.Scanner;

class CWH18_ElseIFStatement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
//                  if(age>56)
//                System.out.println("You are experienced");
//            else if(age>46)
//                System.out.println("You are semi experienced");
//            else if(age>26)
//                System.out.println("You are semi semi experienced");
//            else{
//                System.out.println("You are not experienced");
//            }


//        Switch case
        switch (age) {
            case 18 -> System.out.println("You are going to an adult");
            case 21 -> System.out.println("You are going to join a job");
            case 60 -> System.out.println("You are going to get retired");
            default -> System.out.println("Enjoy your life");
        }

    }
}
