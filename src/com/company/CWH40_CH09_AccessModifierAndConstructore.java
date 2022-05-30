package com.company;

class MyEmployee{
    private int id;
    private String name;

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
}

public class CWH40_CH09_AccessModifierAndConstructore {
    public static void main(String[] args) {
MyEmployee harry=new MyEmployee();
//harry.id=45;
//harry.name="Code with Harry";
    harry.setId(12);
    harry.setName("Prashant");
        System.out.println(harry.getName());
    }
}
