class Cylinder{
    float height,radius;
    public Cylinder(float h,float r)
    {
        height=h;radius=r;
    }
    public void getVolume()
    {
        System.out.println("Volume of cylinder with radius "+radius+" & height "+height+" is: "+(3.14*radius*radius*height));
    }
    public void getArea()
    {
        System.out.println("Area of cylinder with radius "+radius+" & height "+height+" is: "+(2*3.14*radius*height+2*3.14*radius*radius));
    }
}

public class OOPs_constructors_basic {
    public static void main(String[] args) {
        Cylinder obj=new Cylinder(20,10);
        obj.getVolume();
        obj.getArea();
    }
}
