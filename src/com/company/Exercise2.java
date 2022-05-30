package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int computer_chance=r.nextInt(3);
//        System.out.println(a);

        int n=5;
        while(n!=0){
            System.out.println("Enter your choice");
            System.out.println("0.Rock");
            System.out.println("1.Paper");
            System.out.println("2.Scissors");
            int choice=sc.nextInt();
            if(choice<computer_chance){
                if(computer_chance==1){
                    System.out.println("Computer choose paper");
                    System.out.println("You loose!!");
                    n--;
                }
                else if(choice==computer_chance){
                    System.out.println("Draw");
                    continue;
                }
                else{
                    System.out.println("Computer choose Scissors");
                    System.out.println("You win!!");
                    break;
                }
            }
            else if(choice>0){
                if(choice==1){
                    if(computer_chance==0){
                        System.out.println("Computer choose rock");
                        System.out.println("You win!!");
                        break;
                    }else if(computer_chance==2){
                        System.out.println("Computer choose scissors");
                        System.out.println("You loss!!");
                        n--;
                    }
                    else if(choice==computer_chance){
                        System.out.println("Draw");
                        continue;
                    }
                }
                if(choice==2){
                    if(computer_chance==0){
                        System.out.println("Computer choose rock");
                        System.out.println("You loss!!");
                        n--;
                    }else if(computer_chance==1){
                        System.out.println("Computer choose paper");
                        System.out.println("You win!!");
                        break;
                    }
                    else if(choice==computer_chance){
                        System.out.println("Draw");
                        continue;
                    }
                }
            }
        }

        if(n==0){
            System.out.println("You lost the game");
        }
    }
}
