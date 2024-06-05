class Student{
    int id;
    String name;
    public void display()
    {
        System.out.println("Name: "+name+" \nId: "+id);
    }
}
public class OOPs_class_basics {
    public static void main(String[] args) {
        Student obj= new Student();
        obj.name="Somi";
        obj.id=23;
        obj.display();
    }
}
