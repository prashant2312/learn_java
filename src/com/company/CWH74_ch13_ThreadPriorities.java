package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i=34;
        while(true){        System.out.println("Thank you "+this.getName());

//            System.out.println("I am a thread");
        }
    }
}

public class CWH74_ch13_ThreadPriorities {
    public static void main(String[] args) {
//        ready que ke ander sare thread milenge.Maintain by jvm
                MyThr1 t=new MyThr1("Harry");
        MyThr1 t2=new MyThr1("Ram" );
        MyThr1 t3=new MyThr1("Shyam");
        MyThr1 t4=new MyThr1("Mohan");
        MyThr1 t5=new MyThr1("Rohan most important thread");
        t5.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
       t.start();
       t2.start();
       t3.start();
       t4.start();t5.start();

    }
}
