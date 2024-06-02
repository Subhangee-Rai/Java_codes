import org.w3c.dom.ls.LSOutput;

public class method_basics {
    static int sum(int [] arr)
    {
        int sa=0,i;
        for(i=0;i<5;i++)
        {
            sa+=arr[i];
        }
        return sa;
    }
    public static void main(String[] args) {
        int [] arr={10,30,20,40,10};
        int result=sum(arr);
        System.out.println("The sum of all elements in array is: "+result);
    }
}
