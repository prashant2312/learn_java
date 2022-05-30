package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println(" M eak base class constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello sir");
    }
    abstract public void greet();
    abstract public Parent2 greet2();

    private void sayHelloToMaam() {
        System.out.println("Hello");
    }
}

class Child2 extends Parent2{
    public void greet(){
        System.out.println("say good morning");
    }

    @Override
    public Parent2 greet2() {
        System.out.println("Good afternoon sir");
        return null;
    }
}

abstract class child3 extends Parent2{

}

public class CWH53_CH11_Abstract {
    public static void main(String[] args) {
//        Child2 c=new Child2();
    Parent2 p=new Child2().greet2();

    }
}
