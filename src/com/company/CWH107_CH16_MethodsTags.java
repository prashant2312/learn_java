package com.company;

/**
 * This is a good class
 */


public class CWH107_CH16_MethodsTags {
    /**
     *
     * @param args These are arguments that are supplied to the methods
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *Hello this is a method to add the two numbers
     * @param a this is the first number to add
     * @param b This is second number to add
     * @return sum of two  numbers as an integer
     * @throws Exception if b=0
     * @deprecated This method is deprecated
     */

    public int add(int a,int b) throws Exception{
        if(b==0){
            throw new Exception();
        }
        int c;
        c=a+b;
        return c;
    }
}
