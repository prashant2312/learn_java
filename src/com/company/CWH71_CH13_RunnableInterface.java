package com.company;

class MyThreadRunable1 implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("My Thread runnable one");
        }
    }
}

class MyThreadRunable2 implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("My Thread runnable Two");
        }
    }
}

public class CWH71_CH13_RunnableInterface {
    public static void main(String[] args) {
        MyThreadRunable1 bullet1=new MyThreadRunable1();
        Thread gun1=new Thread(bullet1);
        gun1.start();

        MyThreadRunable2 bullet2=new MyThreadRunable2();
        Thread gun2=new Thread(bullet2);
        gun2.start();

    }
}
