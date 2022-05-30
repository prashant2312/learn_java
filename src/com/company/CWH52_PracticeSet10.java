package com.company;

class C1ircle{
    public int radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    C1ircle(int r){
        System.out.println("I am circle perameterize const");
        this.radius=r;
    }
}

class Cylinder1 extends C1ircle {
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
    Cylinder1(int r,int h){
        super(r);
        System.out.println("I am cylinder 1");
        this.height=h;
    }
}

class Rectangles{
    int l,b;

    public void setL(int l) {
        this.l = l;
    }

    public int getL() {
        return l;
    }
    Rectangles(int l, int b){
        this.l=l;
        this.b=b;
    }
    void area(){
        System.out.println("area of rectangle is "+(l*b));
    }
}

class Cuboids extends Rectangles{
    int h;
    Cuboids(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
void volume(){
    System.out.println("Volume of the cuboid is "+(this.l*this.b*this.h));
    }
}

public class CWH52_PracticeSet10 {
    public static void main(String[] args) {
//        circle obj1=new circle(5);

//        Cylinder1 c=new Cylinder1(4,6);
//        double a=c.area();
//        double v= c.volume();
//        System.out.println(a);
//        System.out.println(v);

        Cuboids c=new Cuboids(1,2,3);
        c.area();
        c.volume();
    }
}
