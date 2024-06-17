interface camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Welcome here!");
    }
    //default methods can be used ot call the private methods in interfaces
    default void record4Kvideo(){
        greet();
        System.out.println("Recording 4K video...");
    }
}
interface wifi{
    void connectNetwork(String network);
}
class MyCellPhone{
    void pickCall(long phoneNumber)
    {
        System.out.println("Connecting..call to number "+phoneNumber);
    }
    void callNumber(long  phoneNumber)
    {
        System.out.println("Calling "+phoneNumber);
    }
}
class MySmartPhone extends MyCellPhone implements wifi, camera{
    public void takeSnap(){     //making these functions public is necessary
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public void connectNetwork(String s)
    {
        System.out.println("Connected to network "+s);
    }
////    can be redefined; if defined this implementation otherwise default implementation
//    public void record4Kvideo(){
//        System.out.println("Recording 4k video");
//    }
}
public class OOPs_Interface_basics {
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();
        String s = "Jio";
        long pn = 7899720199L;
        long pn1 = 7899220199L;
        ms.connectNetwork(s);
        ms.takeSnap();
        ms.recordVideo();
        ms.callNumber(pn);
        ms.pickCall(pn1);

        ms.record4Kvideo();
    }
}
