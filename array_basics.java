import java.util.Scanner;

public class array_basics {
    public static void main(String[] args) {
        int [] arr=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of the array are ");
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Length of array is: "+arr.length);

        String [] sarr = {"somi","shubhi","kishu"};
        System.out.println("Elements in string array is:");
        for(i=0;i<sarr.length;i++)
        {
            System.out.println(sarr[i]);
        }
        System.out.println("In reverse order");
        for(i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
//        for each loop
        System.out.println("Using for each loop");
        for(String element:sarr)
        {
            System.out.println(element);
        }
    }
}
