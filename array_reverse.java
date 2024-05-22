public class array_reverse {
    public static void main(String[] args) {
        int [] arr={1,4,2,11,5};
        System.out.println("Reverse array is: ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
