import java.util.Scanner;

public class recursive_sumofnnaturalnumbers {
    static int natural(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+natural(n-1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        int result=natural(n);
        System.out.println("Sum of natural numbers is: "+result);
    }
}
