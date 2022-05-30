package com.company;

public class CWH85_CH14_FinallyBlock {
    static int greet(){
        try{
            int a=50;
            int b=0;
            int c=a/b;
            return c;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Cleaning up resources This is the end of the program");
        }
        return -1;
    }

    public static void main(String[] args) {
//        int k=greet();
//        System.out.println(k);

        int a=7;
        int b=9;
       while (true){
           try{
               System.out.println(a/b);
           }catch(Exception e){
               System.out.println(e);
               break;
           }
           finally {
               System.out.println("Finally block");
           }
           b--;
       }

    }
}
