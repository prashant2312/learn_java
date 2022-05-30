package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Prashant joshi
 * @see <span>to know more see <a>Java docs</a></span>
 * @since 2002
 */

interface MyInt{
    void display();
}

class Mydepricated {
    @Deprecated
    void meth1() {
        System.out.println("I am meth1 depricated");
    }
}

public class CWH112_PracticeSet16 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args)  {
//        Mydepricated md = new Mydepricated();
//        md.meth1();

//        MyInt i=()->{
//            System.out.println("I am display method");
//        };
        int i=13;
        String table="";
        for(int j=1;j<=10;j++){
            table += j+ " * " +i+" = "+(i*j)+"\n";

        }

//        try {
//            FileWriter fileWriter=new FileWriter("Multiplication.txt");
//            fileWriter.write(table);
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file=new File("Multiplication.txt");
        try {
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String tables=sc.nextLine();
                System.out.println(tables);
            }
        sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
