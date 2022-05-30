package com.company;

import java.util.Scanner;

public class CWH81_CH14_SpecificException {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=85;
        marks[2]=44;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index number");
        int index=sc.nextInt();
        System.out.println("Enter the number to be divided");
        int number=sc.nextInt();
                try {
                    System.out.println("The value of array index entered is "+marks[index]);
                    System.out.println("Array value/number = "+marks[index]/number);
                }catch (ArithmeticException e){
                    System.out.println("Some exception occured");
                    System.out.println(e);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(e.getMessage());
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Some other exception handle occur");
                }


    }
}
