package com.company;

interface Bicycle{
    int a=45;
    void applyBreak(int decrement);
    void speedUp(int increment);
    void sum();
}

interface BlowHorn{
    void blowHornK3G();
    void blowHornKKKG();
    void sum();
}

class AvonCycle implements Bicycle ,BlowHorn{
    void blowHorn(){
        System.out.println("Pee poo");
    }

    @Override
    public void applyBreak(int decrement) {
        System.out.println("speed up");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("speed down");
    }

    @Override
    public void sum() {

    }

    @Override
    public void blowHornK3G() {
        System.out.println("From k3g movie");
    }

    @Override
    public void blowHornKKKG() {
        System.out.println("From kbhi kushi kbhi gum");
    }
}

public class CWH54_CH11_Interface {
    public static void main(String[] args) {
AvonCycle avon=new AvonCycle();
avon.blowHornKKKG();
        System.out.println(avon.a);
    }
}
