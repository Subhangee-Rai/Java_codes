import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        float maths, physics, chemistry;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks in maths");
        maths=sc.nextFloat();
        System.out.println("Enter your marks in physics");
        physics=sc.nextFloat();
        System.out.println("Enter your marks in chemistry");
        chemistry=sc.nextFloat();
        float percent=(maths+physics+chemistry)/(3);
        if(percent>=40&&(maths>=33&&physics>=33&chemistry>=33))
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
