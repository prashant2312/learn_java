package com.company;

import java.util.*;

public class CWH91_CH15_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
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
//        l1.clear();



//        System.out.println(l1.contains(108));


//        System.out.print(l1.indexOf(7));

//        System.out.println(l1.lastIndexOf(6));

//        l1.set(1,5000);
//        System.out.println(l1.get(1));


//        System.out.println(l1.hashCode());



//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));
//        }

//        System.out.println(l1.size());


        Object[] a=l1.toArray();
      l1.stream().forEach(e->{
          System.out.println(e);
      });

    }
}
