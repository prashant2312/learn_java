package com.company;

interface Mycamera2{
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
interface Mywifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2{
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

class MySmartPhone2 extends MyCellPhone2 implements Mywifi2,Mycamera2{
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


public class CWH59_CH11_PolymorphismInInterfaces {
    public static void main(String[] args) {
        Mycamera2 cam=new MySmartPhone2();  //This is smartphone use it only as a camera
//        cam.getNetworks();//Not allowed
        cam.recordVideo();
    }
}
