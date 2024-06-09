class Shape{
    int no_of_sides;
    public Shape(int s)
    {
        no_of_sides=s;
    }
    public void method()
    {
        System.out.println("Base class method");
    }
    public void display()
    {
        System.out.println("No of sides: "+no_of_sides);
    }
}
class Rectangles extends Shape{
    String name;
    int length, breadth;
    public Rectangles(String n,int s,int l,int b)
    {
        super(s);
        name=n;
        length=l;
        breadth=b;
    }
    public void method()    //method overloading, this will execute instead of base class method()
    {
        System.out.println("Area of rectangle with length "+length+" & breadth "+breadth+" is "+length*breadth );
        System.out.println("Perimeter of rectangle with length "+length+" & breadth "+breadth+" is "+2*(length+breadth));
    }
    public void display_rec()
    {
        System.out.println("This shape is "+name+" \nLength: "+length+"\nBreadth: "+breadth);
        display();
    }

}
class Squares extends Shape{
    String name;
    int side;
    public Squares(String n,int s,int l)
    {
        super(s);
        name=n;
        side=l;
    }
    @Override       //to show that the method is being overridden
    public void method()    // method overloading, this will execute instead of base class method()
    {
        System.out.println("Area of square with side "+side+" is "+side*side);
        System.out.println("Perimeter of square with side "+side+" is "+4*side);
    }
    public void display_sqr()
    {
        System.out.println("This shape is "+name+" \nSide: "+side);
        display();
    }

}

public class OOPs_method_overloading {
    public static void main(String[] args) {
        System.out.println("Rectangle class:");
        Rectangles rec =new Rectangles("Rectangle",4,40,20);
        rec.display_rec();
        rec.method();

        System.out.println("\nSquare class: ");
        Squares sqr=new Squares("Square",4,40);
        sqr.display_sqr();
        sqr.method();
    }

}
