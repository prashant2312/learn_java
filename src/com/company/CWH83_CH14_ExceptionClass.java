package com.company;

import java.util.Scanner;

class MyException extends Exception {

    public String toString(){
//        return super.toString()+"I am toString";
        return "I am toString";
    }

    public String getMessage(){
//        return super.getMessage()+"I am getMessage()";
        return "I am getMessage()";
    }

}

class MaxAgeException extends Exception {

    public String toString(){
//        return super.toString()+"I am toString";
        return "Age cant not be greater then 125";
    }

    public String getMessage(){
//        return super.getMessage()+"I am getMessage()";
        return "Please make sure that value of age entered is correct";
    }

}

public class CWH83_CH14_ExceptionClass {
    public static void main(String[] args) {
                   int a=0;
                   Scanner sc=new Scanner(System.in);
                   a=sc.nextInt();
                   if(a<99) {
                       try {
                           throw new MyException();
                       }catch (Exception e){
//                           System.out.println(e.getMessage());
//                           System.out.println(e.toString());
//                           System.out.println(e);
                       e.printStackTrace();
                       }
                       System.out.println("Finished");
                   }
        }
    }

