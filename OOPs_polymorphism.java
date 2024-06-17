interface Phonepe{
    default void phoneDis(){
        System.out.println("paying through PhonePe");
    }
}
interface PayPal{
    default void payDis(){
        System.out.println("paying through PayPal");
    }
}
interface GooglePay{
    default void GDis(){
        System.out.println("paying through Google Pay");
    }
}
class MyPayment implements Phonepe, PayPal, GooglePay{
    public void display()
    {
        System.out.println("Hello\nChoose one method to make payment.");
        System.out.println("Thanks for selecting a payment option\nYou are");
    }
}
public class OOPs_polymorphism{
    public static void main(String[] args) {
//        Phonepe obj =new MyPayment();   // can use method of phonepe class only
//        obj.phoneDis();
        MyPayment payment = new MyPayment();
        payment.display();

        // Simulate selecting a payment method
        Phonepe phonepePayment = payment;
        PayPal paypalPayment = payment;
        GooglePay googlePayPayment = payment;

        // Using polymorphism to call the respective methods
        phonepePayment.phoneDis();
        paypalPayment.payDis();
        googlePayPayment.GDis();
    }
}
