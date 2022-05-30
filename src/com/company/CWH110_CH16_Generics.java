package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class MyGeneric<T1,T2>{
    int val=344;
    private T1 t1;
    private T2 t2;

    public void setVal(int val) {
        this.val = val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public T1 getT1() {
        return t1;
    }

    public MyGeneric(int val, T1 t1,T2 t2) {
        this.val = val;
        this.t1=t1;
        this.t2=t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T2 getT2() {
        return t2;
    }
}


public class CWH110_CH16_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
//        ArrayList<int> arrayList=new ArrayList<>(); this will produce an error
//        arrayList.add("str1");
//        arrayList.add(54);
//        arrayList.add(654);
//        arrayList.add(new Scanner(System.in));
//        int a= arrayList.get(1);
//        System.out.println(a);

        MyGeneric<String,Integer> g1=new MyGeneric<>(23,"My string",5555);
        String str=g1.getT1();
        System.out.println(str);
        int val=g1.getT2();
        System.out.println(val);
    }
}
