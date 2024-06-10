interface Vehicle{
    void speedUp(int increment);
    void applyBreak(int decrement);
}
class Bicycle implements Vehicle{
    int speed;
    public void speedUp(int increment)
    {
        System.out.println("Speed Up done");
        speed=speed+increment;
    }
    public void applyBreak(int decrement)
    {
        System.out.println("Breaks applied");
        speed=speed-decrement;
    }
    public void display()
    {
        System.out.println("This bicycle is running at an speed of: "+speed+" kmph ");
    }
}
class Bike implements Vehicle{
    int speed;
    public void speedUp(int increment)
    {
        System.out.println("Speed Up done");
        speed=speed+increment;
    }
    public void applyBreak(int decrement)
    {
        System.out.println("Breaks applied");
        speed=speed-decrement;
    }
    public void display()
    {
        System.out.println("This bike is running at an speed of: "+speed+" kmph ");
    }
}
public class Interface_basics {
    public static void main(String[] args) {
        Bicycle obj=new Bicycle();
        obj.speedUp(60);
        obj.applyBreak(20);
        obj.display();

        Bike obj1=new Bike();
        obj1.speedUp(80);
        obj1.applyBreak(40);
        obj1.display();
    }
}
