package com.company;

class MyNewThr1 extends Thread{

    public void run(){
        int i=34;
        while(true){
            i++;
            System.out.println("Thank you thr1");

            try{
                Thread.sleep(455);
            }
            catch(Exception e){
                e.printStackTrace();
            }

//            System.out.println("I am a thread");
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        int i=34;
        while(true) {
            i++;
            System.out.println("Thank you thr2");
//        while(true){
//            System.out.println("I am a thread");
//        }
        }
    }
}

public class CWH75_CH13_ThreadMethods {
    public static void main(String[] args) {
MyNewThr1 thr1=new MyNewThr1();
MyNewThr2 thr2=new MyNewThr2();
        thr1.start();
//        try{
//            thr1.join();
//        }
//catch(Exception e){
//            e.printStackTrace();
//}
        thr2.start();
    }
}
