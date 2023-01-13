import java.util.*;
public class spiralOrder54 {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer>res=new ArrayList<>();
       int row=matrix.length;
        if (row==0)return res;
       int col=matrix[0].length;

       int l=0,r=col-1,t=0,b=row-1 ,d=0;
       while (l<=r && t<=b){
           if ( d==0){
               for (int i = l; i <=r ; i++) {
                   res.add(matrix[t][i]);
               }
               d=1; t++;
           }
           if ( d==1){
               for (int i = t; i <=b ; i++) {
                   res.add(matrix[i][r]);
               }
               d=2; r--;
           }
           if ( d==2){
               for (int i = r; i <=l ; i++) {
                   res.add(matrix[b][i]);
               }
               d=3; b--;
           }
           if ( d==3){
               for (int i = b; i <=t ; i++) {
                   res.add(matrix[i][l]);
               }
               d=0; l++;
           }
       }
       return res;


    }
}
