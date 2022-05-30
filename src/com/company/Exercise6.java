package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class Greater extends Exception{
    public String toString(){
      return "You have entered a big number";
    }
}
class NewWrongChoiceException extends Exception{
    public String toString()  {
        return "You have selected a wrong operation";
    }
}

public class Exercise6 {

    static boolean greater(int a,int b,int c){
        if(a>4000||b>4000 ){
            try {
                throw new Greater();

            }catch(Greater g){
                System.out.println(g);
            }
            finally {
                return false;
            }
        }
        if(c==4 && b==0)
        {
            try {
                throw new ArithmeticException("Divide by 0");
            }catch (ArithmeticException e){
                System.out.println(e);
            }finally {
                return false;
            }
        }
        return true;

    }

    static void calculate(int a, int b, int c) {
    if(c==1){
        boolean flag=greater(a,b,c);
        if(flag){
            System.out.println(a+b);
        }
    }
    else if(c==2){
        boolean flag=greater(a,b,c);
        if(flag){
            System.out.println(a-b);
        }
    }
    else if (c==3){
        boolean flag=greater(a,b,c);
        if(flag){
            System.out.println(a*b);
        }
    }
    else if(c==4){
        boolean flag=greater(a,b,c);
        if(flag){
            System.out.println(a/b);
        }
    }
    else {
        try{
        throw new NewWrongChoiceException();
    }catch (NewWrongChoiceException e){
            System.out.println(e);
        }
    }
    }
    public static void main(String[] args) {
/*
Create a custom calculator using operations 1->Addition 2->Substraction 3->Multiplication 4->Divide
exception like 1->Invalid input 2->Cannot divide by zero exception 3->Max input exception  4->can not multiply by greater than 7000 exception
*/



        System.out.println("Welcome to smart calculator");
        int a;
        int b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first value");
        a=sc.nextInt();
        System.out.println("Enter second value");
       b= sc.nextInt();
        System.out.println("Select your operation");
        System.out.println("1 -> +");
        System.out.println("2 -> -");
        System.out.println("3 -> *");
        System.out.println("4 -> /");
        int operation =sc.nextInt();


        calculate(a,b,operation);

    }
}
