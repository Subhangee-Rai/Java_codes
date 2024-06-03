public class recursive_star_pattern {
    static void pattern(int n)
    {
        int i;
        if(n>0)
        {
            pattern(n-1);
            for(i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        pattern(5);
    }
}
