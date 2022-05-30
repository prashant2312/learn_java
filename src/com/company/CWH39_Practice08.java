package com.company;

class Employees{
    int salary;
    String name;
    public int getSalary(){
        return 100000;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}

class Square{
    int a;
    public void getA(int a){
        this.a=a;
    }
    public void peremeter(){
        System.out.println("Perimeter is "+2*a);
    }
    public void area(){
        System.out.println("Area is "+(a*a));
    }
}
class rectangle{
    int l,b;
    public void setLB(int l,int b){
        this.l=l;this.b=b;
    }
    public void perimeter(){

        System.out.println("Perimeter is "+(2*(l+b)));
    }
    public void getArea(){
        System.out.println("Area is "+(l*b));
    }
}
class Circle{
    int r;
    public void setRadius(int r){
        this.r=r;
    }
    public void getPerimeter(){
        System.out.println("Perimeter is "+(2*Math.PI*r));
    }
    public void getArea(){
        System.out.println("Area is "+(Math.PI*r*r));
    }
}
public class CWH39_Practice08 {
    public static void main(String[] args) {
//Employees e=new Employees();
//e.setName("Prashant");
//        System.out.println(e.getName());
//        System.out.println(e.getSalary());
//        Square s=new Square();
//        s.getA(5);
//        s.peremeter();
//        s.area();


//        rectangle r=new rectangle();
//        r.setLB(11,10);
//        r.getArea();
//        r.perimeter();


//        Circle c=new Circle();
//        c.setRadius(3);
//        c.getArea();
//        c.getPerimeter();
        System.out.println(Math.sqrt(25));

    }
}
