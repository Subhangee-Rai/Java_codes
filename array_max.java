public class array_max {
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{4,5,6}};
        int i,j,max=0,min=arr[0][0];
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
                else if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Maximum element in array is "+max);
        System.out.println("Minimum element in array is "+min);

    }
}
