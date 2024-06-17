interface House{
    default void windows(int nw){
        System.out.println("This house has "+nw+" windows.");
    }
    default void doors(int nd){
        System.out.println("This house has "+" doors.");
    }
    default void rooms(int nr){
        System.out.println("This house has "+nr+" rooms.");
    }
}
// inheritance in interface
interface myHouse extends House{
    default void kitchen(){
        System.out.println("This house has 1 kitchen with chimney.");
    }
    default void bathroom(){
        System.out.println("This house has 1 bathroom with washroom attached.");
    }
}
// class can implement but not extend interface
class sweetHome implements myHouse{
    public void display(){
        System.out.println("Welcome to my sweet home!\nHere are the details:");
    }
}
public class OOPs_inheritance_in_interface{
    public static void main(String[] args) {
        sweetHome obj=new sweetHome();
        obj.display();
        obj.windows(4);
        obj.doors(6);
        obj.rooms(4);
        obj.kitchen();
        obj.bathroom();
    }
}
