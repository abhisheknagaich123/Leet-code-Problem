import java.lang.reflect.Array;

public class Move_zeros {
    static void moveZeroes(int[] num) {
        int j=0;
        for (int i = 0; i <num.length; i++) {
            if(num[i]!=0){
                num[j]=num[i];
                j++;
            }
        }
        for (int i = j; i < num.length ; i++) {
            num[i]=0;
        }
    }
    public static void main(String[] args) {
      int []arr={0,1,0,3,12};
      moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
