package com.company;

public class CWH32_CH07_MethodOverloading {
    static void change(int [] a){
        a[1]=3424;
    }
    static void tellJokes(){
        System.out.println("During a lesson about adjectives, my friend, an elementary school teacher, asked her class to describe their mothers. One boy described his mother’s hair as auburn. Impressed by his sophisticated...");
    }

    static void foo(){
        System.out.println("Hellol");
    }
    static void foo(int a){
        System.out.println("Good morning "+a);
    }
    static void foo(int a,int b){
        System.out.println("Good morning "+a);
        System.out.println("Good morning "+b);
    }
    static void foo(int a,int b,int c){
        System.out.println("Good morning "+a);
        System.out.println("Good morning "+b);
    }

    public static void main(String[] args) {
//tellJokes();
//int [] marks={52,55,24,44,52};
//int x=33;
////change(x);
////        System.out.println(x);
//        System.out.println("Before "+marks[1]);
//   change(marks);
//        for (int e:marks
//             ) {
//            System.out.println(e);
//        }

    foo(3000);
    }
}
