import java.util.Scanner;
public class pattern_loop {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Input the number of rows & columns you want respectively");
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        if ((i < 1 || i > 10) || (j < 1 || j > 10)||(i>j)) {
            System.out.println("Your inputted value exceeds the limit!");
            return;
        }
        System.out.println("Here's your pattern!");
        int a,b;
        for(a=1;a<i+1;a++)
        {
            for(b=a;b<j+1;b++)
            {
                System.out.print(b);
            }
            System.out.print("\n");
        }
    }
}
