import java.util.Scanner;

public class sum_even_loops {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter natural number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("Sum of first"+n+" even natural numbers is: "+sum);
    }
}
