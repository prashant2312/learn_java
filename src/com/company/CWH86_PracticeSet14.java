package com.company;

import java.util.Scanner;

class MaxLimit extends Exception{
    @Override
    public String toString() {
        return "Hello maximum limit is reached";
    }

}

public class CWH86_PracticeSet14 {
   static int maxValue(int i) throws MaxLimit{
       if(i>=5){
           throw new MaxLimit();
       }
        return 9;
    }
    public static void main(String[] args) {
//        int a=10//syntax error


//        logical error
//        int age =78;
//        int born=2000-78;
//        System.out.println(born);

//        runtime error
//        System.out.println(2/0);

        Scanner sc=new Scanner(System.in);

//        int var=sc.nextInt();
//        try{
//            System.out.println(6/var);
//        }catch(ArithmeticException e){
//            System.out.println("Haha");
//        }

        boolean flag=true;
int i=1;
        int [] marks={12,44,55,62,45};

        while(flag&&i<=5){
            int index=sc.nextInt();

            try{
                System.out.println(marks[index]);
                flag=false;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                i++;
            }
        }
//        if(i>5){
//            try{
//            throw new MaxLimit();
//        }catch (MaxLimit e){
//                System.out.println(e);
//            }
//        }
        if(i>=5){
            try {
                maxValue(i);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
