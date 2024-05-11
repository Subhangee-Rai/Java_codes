public class factorial_loops {
    public static void main(String[] args) {
        int n=5,i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("Fcatorial of "+n+" is "+fact);
    }
}
