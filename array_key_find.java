import java.util.Scanner;

public class array_key_find {
    public static void main(String[] args) {
        int []arr= {1,2,3,4,5};
        int i,element;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        element=sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(element==arr[i])
            {
                System.out.println("Element present in array at index "+i);
                break;
            }
        }
        System.out.println("Element not found in array");

    }
}
