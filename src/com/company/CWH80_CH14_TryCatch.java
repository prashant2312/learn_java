package com.company;

public class CWH80_CH14_TryCatch {
    public static void main(String[] args) {
        int a=0;
        int b=12;
        try{
            int c=b/a;
            System.out.println("The result is "+c);

        }
catch (Exception e){
    System.out.println(e);
}
        System.out.println("End of the program");
    }
}
