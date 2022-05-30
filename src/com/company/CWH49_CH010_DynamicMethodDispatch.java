package com.company;

class Phone{
    void showTime(){
        System.out.println("Please show the time");
    }
    public void greet(){
        System.out.println("Good morning");
    }
    public void myName(){
        System.out.println("My name is Java in class One");
    }
}
class SmartPhone extends Phone{

    public void swagat(){
        System.out.println("Aapka swagat ha");
    }

    public void runMusic(){
        System.out.println("Run the music please");
    }
    public void myName(){
        System.out.println("My name is Java in class two");
    }
}

public class CWH49_CH010_DynamicMethodDispatch {
    public static void main(String[] args) {
//Phone obj=new Phone();
SmartPhone smobj=new SmartPhone();
//        obj.myName();



        Phone obj=new SmartPhone();
//        SmartPhone obj2=new Phone();
        obj.showTime();
            obj.greet();
            obj.myName();
//obj.runMusic();
    }
}
