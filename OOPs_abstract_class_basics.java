abstract class base_class{
    public base_class()
    {
        System.out.println("Constructor of base class");
    }
    abstract public void greet();
}
class derived_class extends base_class{
    public derived_class(){
        System.out.println("Constructor of derived class");
    }
    @Override
    public void greet()
    {
        System.out.println("Hello, welcome to the derived class");
    }
}
class derived_class1 extends base_class{
    public derived_class1(){
        System.out.println("Constructor of derived class 1");
    }
    @Override
    public void greet()
    {
        System.out.println("Hello, welcome this is derived class 1");
    }
}
public class OOPs_abstract_class_basics {
    public static void main(String[] args) {
        derived_class obj=new derived_class();
        obj.greet();

        derived_class1 obj1 = new derived_class1();
        obj1.greet();

//        base_class obj2 = new base_class();         can't do this, but can create a pointer
    }
}
