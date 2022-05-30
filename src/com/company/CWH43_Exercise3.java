package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    Random r=new Random();
    Scanner sc=new Scanner(System.in);
    int n=10;
    public int computer_value;
     Game(){
       computer_value=r.nextInt(101);
//        System.out.println(computer_value);
    }
    void IsCorrectNumber(){
         while(n>0) {
             System.out.println("Enter a number");
             int num=sc.nextInt();
             if (computer_value == num) {
                 System.out.println("You won");
                 break;
             } else if (num > computer_value) {
                 System.out.println("Greater value");
                 n--;

             } else {
                 System.out.println("You have entered a small value");
                 n--;
             }
         }

    }

}

public class CWH43_Exercise3 {
    public static void main(String[] args) {
//        Create class game which allows user to play guess the number
//        take user input
//inCorrectNumber()
//        System.out.println(Math.random());
        Game g = new Game();
//        System.out.println(g);
    g.IsCorrectNumber();
    }
}
