import java.util.Scanner;

public class multidimensioal_array {
    public static void main(String[] args) {
        int [][] arr=new int[2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of 2-D array");
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

//        Displaying elements
        System.out.println("Elements in the array are: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
