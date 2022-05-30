package com.company;

class EkClass{
    int a;
    public int returnone(){
        return 1;
    }

    public int getA() {
        return a;
    }

    public EkClass(int a) {
        this.a = a;

    }
}
class DoClass extends EkClass{
    public DoClass(int c) {
        super(c);
        System.out.println("M ek DoClass hu");
    }
}
public class CWH47_CH10_ThisSuper {
    public static void main(String[] args) {
//        EkClass e=new EkClass(5);
//        System.out.println(e.getA());

        DoClass dos=new DoClass(5);
    }
}
