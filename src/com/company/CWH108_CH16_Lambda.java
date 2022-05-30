package com.company;

//class AnonyDemo implements DemoAno{
//    void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}


//class HarryFunc implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("this is method 1");
//    }
//}

public class CWH108_CH16_Lambda {
    public static void main(String[] args) {
//DemoAno obj=new AnonyDemo();
//obj.meth1();


//        This is anonymous class
// DemoAno obj=new DemoAno() {
//     @Override
//     public void meth1() {
//         System.out.println("I am meth 1");
//     }
//
//     @Override
//     public void meth2() {
//         System.out.println("I am meth 2");
//     }
// };
// obj.meth1();


// Lambda expression
//        DemoAno obj=new HarryFunc();
//        obj.meth1();
        DemoAno obj=(a)->{
            System.out.println("I am method one "+a);
        };
        obj.meth1(5);

    }
}
