import java.util.InputMismatchException;
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        int num, given;
        given = 10;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
            if (num > given) {
                System.out.println("Greater");
            } else {
                System.out.println("Smaller");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter an integer number");
        }
    }
}
