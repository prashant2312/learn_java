package com.company;

class Base{
    int x;

    public void setX(int x) {
        System.out.println("I am in base setting x now");
        this.x = x;
    }

    public int getX() {
        return x;
    }

    void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base {
int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

class Animal{
    void animal(){
        System.out.println("This is animal class");
    }
}

class Dog extends Animal{

}

public class CWH45_CH10_Inheritance {
    public static void main(String[] args) {

//        Base b=new Base();
//        b.setX(12);
//        System.out.println(b.getX());
//        System.out.println();

//        Creating an object of derived class
        Derived d =new Derived();
        d.setX(12);
        d.setY(40);
        System.out.println(d.getX());
        System.out.println(d.getY());

        Dog dog =new Dog();
        dog.animal();

    }
}
