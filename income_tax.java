import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        float income,tax=0.0f;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your income");
        income=sc.nextFloat();
        if(income<250000)
        {
            tax=0.0f;
        }
        else if(income>250000&&income<500000)
        {
            tax=(income-250000)*0.05f;
        }
        else if(income>=500000&&income<1000000)
        {
            tax=5000000*0.05f+(income-500000)*0.20f;
        }
        else if(income>=1000000)
        {
            tax=250000*0.20f+5000000*0.05f+(income-500000)*0.20f;
        }
        System.out.println("Tax on your income of Rs "+income+" is "+tax);
    }
}
