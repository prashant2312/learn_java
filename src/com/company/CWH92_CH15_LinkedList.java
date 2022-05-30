package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class CWH92_CH15_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(100);
        l2.add(101);
        l2.add(102);
        l2.add(103);
        l2.add(104);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
        l1.addAll(0,l2);
        l1.addLast(1000);
        l1.addFirst(400000000);
        System.out.println(l1);
    }
}
