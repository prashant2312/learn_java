package com.company;

class Cylinder{
    private int radius;
    private int height;

    public void setHeight(int height){
        this.height=height;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public void surface(){
        System.out.println("Surface of the cylinder is "+(2*Math.PI*radius*height*(radius+height)));
    }
    public void volume(){
        System.out.println("Volume is "+(Math.PI*radius*radius*height));
    }
}

class Sphere{
    int r;

    public void volume(){
        System.out.println(r);
        double volumes=4/3d*Math.PI*r*r*r;
        System.out.println(volumes);
//        System.out.println("Volume of Sphere is "+();
    }
}

public class CWH44_CH09_PracticeSet09 {
    public static void main(String[] args) {
//Cylinder c=new Cylinder();
//c.setHeight(4);
//c.setRadius(2);
//c.surface();
//c.volume();
        Sphere s=new Sphere();
        s.r=2;
        s.volume();
    }
}
