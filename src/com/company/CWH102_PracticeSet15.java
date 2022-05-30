package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CWH102_PracticeSet15 {
    public static void main(String[] args) {
//        ArrayList
//        ArrayList<String> st=new ArrayList<>();
//        st.add("Student 1");
//        st.add("Student 2");
//        st.add("Student 3");
//        st.add("Student 4");
//        st.add("Student 5");
//        st.add("Student 6");
//        st.add("Student 7");
//        st.add("Student 8");
//        st.add("Student 9");
//        st.add("Student 10");
//
//        for(Object e:st){
//            System.out.println(e);
//        }



        //Question number 5
//        HashSet<Integer> set=new HashSet<>();
//        set.add(5);
//        set.add(7);
//        set.add(12);
//        set.add(8);
//        set.add(5);
//        System.out.println(set);



//        Question 2
//        Date d=new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());


//        Question 3
//        Calendar c=Calendar.getInstance();
//        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

//        Question
        LocalTime time=LocalTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("H:m:s");
        String myTime=dtf.format(time);
        System.out.println(myTime);

    }
}
