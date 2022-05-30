package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i=34;
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}


class MyThreadRunn implements Runnable{
    public void run(){
        System.out.println("This is method by using runnable interface");
    }
    MyThreadRunn(){

    }
}


public class CWH73_ch13_ThreadConstructor {
    public static void main(String[] args) {
//        MyThr t=new MyThr("Harry");
//        MyThr t2=new MyThr("Ram");
//        t.start();
//        t2.start();
//        System.out.println("The id of the thread is "+t.getId());
//        System.out.println("The id of the thread 2 is "+t2.getId());
//        System.out.println("The id of the thread is "+t.getName());
//        System.out.println("The id of the thread 2 is "+t2.getName());


//        MyThreadRunn  r=new MyThreadRunn();
//        Thread th=new Thread(r,"Prashant");
//        th.start();
//        System.out.println(th.getName());

    }
}
