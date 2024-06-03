import java.util.Scanner;

public class recursive_nth_term_of_fibseries {
    static int fib(int n)
    {
        //method 1
//        if(n==1)
//        {
//            return 0;
//        }
//        else if(n==2)
//        {
//            return 1;
//        }

        //method 2
        if(n==1||n==2)
        {
            return n-1;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();
        int result=fib(n);
        System.out.println(n+"th term of fibonacci series is: "+result);

    }
}
