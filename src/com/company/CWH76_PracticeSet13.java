package com.company;

class Practice13 extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Good morning");
        }
    }
}

class Practice13b extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Welcome");
        }
    }
}


public class CWH76_PracticeSet13 {
    public static void main(String[] args) {
        Practice13 p=new Practice13();
        Practice13b p2=new Practice13b();
        p.start();
//        p.setPriority(4 );
        System.out.println(p.getPriority());
        System.out.println(p2.getPriority());
        p2.start();
    }
}
