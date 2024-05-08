import java.util.Scanner;

public class digit {
    public static void main(String[] args) {
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        switch (number)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                System.out.println("Digit");
                break;
            default:
                System.out.println("Enter a valid digit btw 0-9");
                break;
        }
    }
}
