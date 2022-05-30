package com.company;

class MyThread1 extends Thread{
    public void run() {
        int i=0;
        while (i<400) {
            i++;
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
        }
    }
}
class MyThread2 extends Thread{
    public void run() {
        int i=0;
        while (i<400) {
            i++;
            System.out.println("My cheating thread two is running");
            System.out.println("I am sad");
        }
    }
}
public class CWH70_CH13_ThreadClass {
    public static void main(String[] args) {
MyThread1 t1=new MyThread1();
MyThread2 t2=new MyThread2();
t1.start();
t2.start();
    }
}
