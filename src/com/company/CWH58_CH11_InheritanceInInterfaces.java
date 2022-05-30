package com.company;

interface samapleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends samapleInterface {
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface {

    @Override
    public void meth1() {
        System.out.println("This is meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("This is meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("This is meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("This is meth 4");
    }
}

public class CWH58_CH11_InheritanceInInterfaces {
    public static void main(String[] args) {
MySampleClass obj=new MySampleClass();
obj.meth1();
obj.meth2();
obj.meth3();
obj.meth4();
    }
}
