package com.company;

interface pen{
    void write();
    void refill();
}

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FoundationPen extends Pen{

    @Override
    void write() {
        System.out.println("This is my black pen");

    }

    @Override
    void refill() {
        System.out.println("This is now empty");

    }
    void nib(){
        System.out.println("This is smooth nib");
    }
}
class MyPen implements pen{

    @Override
    public void write() {
        System.out.println("This is my black pen");
    }

    @Override
    public void refill() {
        System.out.println("This is now empty");
    }
}

public class CWH60_PracticeSet_11 {
    public static void main(String[] args) {
FoundationPen p=new FoundationPen();
p.refill();
    }
}
