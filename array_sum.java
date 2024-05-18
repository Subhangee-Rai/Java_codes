import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        float [] arr=new float[5];
        Scanner sc=new Scanner(System.in);
        int i;float sum=0f;
        for(i=0;i<5;i++)
        {
            System.out.print("Enter element: ");
            arr[i]=sc.nextFloat();
            sum+=arr[i];
        }
        System.out.println("Sum of array elements is "+sum);

    }
}
