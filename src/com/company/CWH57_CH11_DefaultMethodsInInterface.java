package com.company;

interface Mycamera{
    void takesnap();
    void recordVideo();
    private void greet(){
        greet();
        System.out.println("Good morning");
    }
    default void record4kVideo(){
        System.out.println("recording in 4k");
    }
}
interface Mywifi{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
//    void takeSnap(){
//        System.out.println("taking snap");
//    }
}

class MySmartPhone extends MyCellPhone implements Mywifi,Mycamera{
       public void takesnap(){
        System.out.println("taking snap");
    }


    @Override
    public void recordVideo() {
        System.out.println("Recording the video");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("getting list of network");
        String[] networkList={"Harry","Prashant","Anjali364"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+network);
    }

//    public void record4kVideo(){
//        System.out.println("Taking snap and recording in 4k");
//    }
}

public class CWH57_CH11_DefaultMethodsInInterface {
    public static void main(String[] args) {
MySmartPhone ms=new MySmartPhone();
 String [] ar= ms.getNetworks();
 for(String e:ar){
     System.out.println(e);
 }
 ms.record4kVideo();
    }
}
