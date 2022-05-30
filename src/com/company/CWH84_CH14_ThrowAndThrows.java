package com.company;

class NegativeRadius extends Exception {

    public String toString(){
//        return super.toString()+"I am toString";
        return "Negative radius ";
    }

    public String getMessage(){
//        return super.getMessage()+"I am getMessage()";
        return "Radius cant not be given negative";
    }

}

public class CWH84_CH14_ThrowAndThrows {
   static int divide (int a,int b) throws ArithmeticException {
        return a/b;
    }
    static double area(int r) throws NegativeRadius{
       if(r<0){
           throw new NegativeRadius();
       }
       return Math.PI*r*r;
    }
    public static void main(String[] args) {
//        Shivam uses divide function create by harry
try {
//    int c = divide(6, 0);
//    System.out.println(c);
    double ar=area(-6);

}
catch (Exception e){
    System.out.println("Exception");
    System.out.println(e);
}

    }
}
