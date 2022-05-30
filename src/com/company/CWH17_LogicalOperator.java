package com.company;

public class CWH17_LogicalOperator {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=true;
        if(a||b&&c){
            boolean res=a&&b||c;
            System.out.println(res);
        }
        else{
            System.out.println("N");
        }
    }
}
