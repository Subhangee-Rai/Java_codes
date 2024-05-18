public class for_each_loop {
    public static void main(String[] args) {
        int []arr={48,49,77,66,42,45};
        double avg=0,sum=0;
        for(int element : arr)
        {
            sum+=element;
        }
        System.out.println("Average marks: "+(sum/6));
    }
}
