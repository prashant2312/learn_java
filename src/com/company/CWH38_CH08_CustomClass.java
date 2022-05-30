package com.company;

class Employee{
    int id;
    String name;public void printDetails(){
        System.out.println("My id is "+this.id);
        System.out.println("My name is "+this.name);
    }
}

public class CWH38_CH08_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
Employee harry=new Employee();//Instantiating the new Employee object
Employee john=new Employee();//Instantiating the new Employee object
harry.id=12;
harry.name="Prashant";
john.id=13;
john.name="John khandelwal";
harry.printDetails();
john.printDetails();
//        System.out.println(harry.id);
//        System.out.println(harry.name);
    }
}
