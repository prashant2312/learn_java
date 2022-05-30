package com.company;

class Base1{
    public Base1() {
        System.out.println(" I am a base class constructor");
    }

    Base1(int a){
    System.out.println(" I am a constructor in Base1 class "+a);
}
}
class Derived1 extends Base1{


    public Derived1() {
//        super(1);
        System.out.println("I am derived class constructor");
    }

    public Derived1(int x,int y) {
        super(x);
        System.out.println("I am a constructor of"+x+" and "+y);
    }
}

class ChildOfDerived extends Derived1{
    public ChildOfDerived() {
        System.out.println("I am child of derivrd class constructor");
    }

    public ChildOfDerived(int x, int y,int z) {
        super(x, y);
        System.out.println("I am child of derivred constructor having 3 vslues");
    }
}
public class CWH46_CH10_ConstructorInheritance {
    public static void main(String[] args) {
//        Base1 b=new Base1();
//        Derived1 d=new Derived1(4,9);

        ChildOfDerived cod=new ChildOfDerived(1,2,3);
    }
}
