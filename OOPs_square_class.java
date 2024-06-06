
class Square{
    int side;
    public void setSide(int s){side=s;}
    public void getArea(){
        System.out.println("Area of square with side "+side+" is: "+side*side);
    }
    public void getPeri()
    {
        System.out.println("Perimeter of square with side "+side+" is: "+4*side);
    }
}
class Rectangle{
    int length, breadth;
    public void setLB(int l,int b){
        length=l;
        breadth=b;
    }
    public void getArea(){
        System.out.println("Area of rectangle with length "+length+" & breadth "+breadth+" is: "+length*breadth);
    }
    public void getPeri()
    {
        System.out.println("Area of rectangle with length "+length+" & breadth "+breadth+" is: "+2*(length+breadth));
    }
}
public class OOPs_square_class {
    public static void main(String[] args) {
        Square obj=new Square();
        obj.setSide(40);
        obj.getArea();
        obj.getPeri();

        Rectangle obj1=new Rectangle();
        obj1.setLB(20,10);
        obj1.getArea();
        obj1.getPeri();
    }
}
