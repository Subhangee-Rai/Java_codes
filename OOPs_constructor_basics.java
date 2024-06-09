class Books{
    String name;
    int id;
    public Books()
    {
        System.out.println("Default constructor of base class");
    }
    public Books(String n, int i)
    {
        System.out.println("Parameterized constructor of base class");
        name=n; id=i;
    }
    public void display()
    {
        System.out.println("Book name: "+name);
        System.out.println("Id: "+id);
    }
}
class Stud extends Books{
    int sid;
    String s_name;
    public Stud()
    {
        System.out.println("Default constructor of derived class");
    }
    public Stud(String sn,int si,int i,String n)
    {
        super(n,i); //this must be first statement in the function body
        System.out.println("Parameterized constructor of derived class");
        s_name=sn;
        sid=i;
    }
    public void display_der()
    {
        display();
        System.out.println("Student name: "+s_name);
        System.out.println("Student id: "+sid);
    }
}
public class OOPs_constructor_basics {
    public static void main(String[] args) {
        System.out.println("Without parameters provided");
        Stud obj = new Stud();
        obj.display_der();

        System.out.println("\nWith parameters provided");
        Stud obj1 = new Stud("Somi", 1,1001,"Sherlock holmes");
        obj1.display_der();
    }
}
