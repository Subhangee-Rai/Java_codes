abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    public void changeNib()
    {
        System.out.println("Changing nib...");
    }
    public void write()
    {
        System.out.println("Writing...");
    }
    public void refill(){
        System.out.println("Refilling...");
    }
}
class Monkey{
    public void jump()
    {
        System.out.println("Jumping...");
    }
    public void bite() {
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void sleep();
    void eating();
}
class Human extends Monkey implements BasicAnimal{
    public void sleep()
    {
        System.out.println("Sleeping...");
    }
    public void eating()
    {
        System.out.println("Eating...");
    }
}
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelePhone{
    public void ring()
    {
        System.out.println("Ringing...");
    }
    public void lift()
    {
        System.out.println("Lifting...");
    }
    public void disconnect()
    {
        System.out.println("Disconnecting...");
    }
}
public class OOPs_exercise {
    public static void main(String[] args) {
        //Question 1 : abstract class created

        // Question 2
        FountainPen fp= new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        //Question 3
        Human h=new Human();
        h.bite();
        h.jump();
        h.eating();
        h.sleep();

        //Question 4 : polymorphism using Telephone class
        TelePhone tp=new SmartTelephone();
        tp.ring();
        tp.lift();
        tp.disconnect();

        //Question 5 : polymorphism using monkey class
        Monkey m=new Human();
        m.bite();
        m.jump();

        //Question 6

    }
}
