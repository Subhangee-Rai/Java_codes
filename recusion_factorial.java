import java.util.Scanner;

public class recusion_factorial {
    static int factorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Enter a valid number");
        }
        int result=factorial(n);
        System.out.println("Factorial of "+n+" is "+result);
    }
}
