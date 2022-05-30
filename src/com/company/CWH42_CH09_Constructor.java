package com.company;

class MyMainEmployee{
    private int id;
    private String name;
public String city;
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int id){
        this.id=id;
    }
    public MyMainEmployee(String name,int id){
        this.id=id;
        this.name=name;
    }
    public MyMainEmployee(String name,int id,String city){
        this.name=name;
        this.id=id;
        this.city=city;
    }

}

public class CWH42_CH09_Constructor {
    public static void main(String[] args) {
        System.out.println("Constructor");
        MyMainEmployee harry=new MyMainEmployee("Prashant Joshi",12);
        MyMainEmployee harry2=new MyMainEmployee("Prashant Joshi",12,"Faridabad");
//        harry.setName("Prashant Joshi");
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println(harry2.city);
    }
}
