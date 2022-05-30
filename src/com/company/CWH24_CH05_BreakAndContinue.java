package com.company;

public class CWH24_CH05_BreakAndContinue {
    public static void main(String[] args) {
//        Break and continue using loops
        for(int i=0;i<=5;i++){
//            System.out.println("Java is great");

        if(i==2) {

            System.out.println("This is continue");
//            System.out.println("Ending the loop");
            continue;
        }
            System.out.println(i);
        }
        System.out.println("Loops ends here");
    }
}
