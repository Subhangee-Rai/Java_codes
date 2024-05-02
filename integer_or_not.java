import java.util.Scanner;

public class integer_or_not {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            System.out.println("Entered number is an integer");
            return;
        }
        System.out.println("Entered number is not an integer");
    }
}
