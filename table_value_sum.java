public class table_value_sum {
    public static void main(String[] args) {
        int n=8,i,sum=0;
        for(i=1;i<11;i++)
        {
            sum+=n*i;
        }
        System.out.println("Sum of numbers occuring in multiplication table of "+n+" is "+sum);
    }
}
