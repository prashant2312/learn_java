package com.company;

@FunctionalInterface
 interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends Phone{

    @Override
    public void showTime(){
        System.out.println("Time is 8 PM");
    }
    @Deprecated
    public int sum(int a,int b){
        return a+b;
    }

        }



public class CWH108_CH16_JavaAnnotations {
    @SuppressWarnings("This is depricated method")
    public static void main(String[] args) {
    NewPhone np=new NewPhone();
    np.showTime();
       np.sum(1,5);
    }
}
