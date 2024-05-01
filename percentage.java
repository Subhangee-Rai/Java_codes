import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("How many subjects you have?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        System.out.println("Enter your marks in each subject one y out of 100");
        float sum=0.0f,b;
        for(i=0;i<n;i++)
        {
            b=sc.nextFloat();
            if(b>100)
            {
                System.out.println("Marks should be out of 100!");
                return;
            }
            sum+=b;
        }
        double avg=(sum/(n*100))*100;
        System.out.println("Percentage is:"+avg);
    }
}
