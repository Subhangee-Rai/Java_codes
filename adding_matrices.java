public class adding_matrices {
    public static void main(String[] args) {
        int [][] arr1= {{1,2,3},{4,5,6}};
        int [][] arr2 ={{1,1,1},{1,1,1}};
        int [][] sum=new int[2][3];
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
