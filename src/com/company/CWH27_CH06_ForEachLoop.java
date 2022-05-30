package com.company;

public class CWH27_CH06_ForEachLoop {
    public static void main(String[] args) {
//        int [ ] marks={100,101,102,103,104};
        float [] marks={100,101,102,103,104};
//        System.out.println(marks.length);
//
//        String [] student={"Harry","Rohan","Shubham","Lavish"};
//        System.out.println(student[1].length());

//        Naive way
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);


//        Using for loop
//        for(int i= marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//        }


//        Using for each loop
        for (float e:marks) {
            System.out.println(e);
        }
    }
}
