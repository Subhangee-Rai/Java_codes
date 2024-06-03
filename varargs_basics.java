public class varargs_basics {
    static int sum(int ...arr)
    {
        int sum=0;
        for(int a:arr)
        {
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result=sum(7,8);
        System.out.println("Result of 7+8: "+result);
        result=sum(7,8,9);
        System.out.println("Result of 7+8+9: "+result);
        result=sum(7);
        System.out.println("Result of 7: "+result);
        result=sum(7,8,9,10);
        System.out.println("Result of 7+8+9+10: "+result);

    }
}
