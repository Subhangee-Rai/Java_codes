public class method_overloading {
    static int addition(int a)
    {
        return a++;
    }
    static int addition(int a,int b)
    {
        return a+b;
    }
    static int addition(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        int result;
        result=addition(5);
        System.out.println("Result of addition a: "+result);
        result=addition(5,10);
        System.out.println("Result of addition a,b: "+result);
        result=addition(5,10,15);
        System.out.println("Result of addition a,b,c: "+result);


    }
}
