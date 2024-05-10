import java.util.Scanner;

public class website_type {
    public static void main(String[] args) {
        System.out.println("Enter website name");
        Scanner sc= new Scanner(System.in);
        String str;
        str=sc.next();
        if(str.endsWith("org"))
        {
            System.out.println("This is an organizational website");
        }
        else if(str.endsWith("in"))
        {
            System.out.println("This is an Indian website");
        }
        else if(str.endsWith(".com"))
        {
            System.out.println("This is a commercial website");
        }
    }
}
