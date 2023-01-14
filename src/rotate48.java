public class rotate48 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;


        //    transope
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n/2 ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][j-1-j];
                matrix[i][j-1-j]=temp;
            }
        }


    }
}
