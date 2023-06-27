import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_1_Two_sum {

    public static void main(String[] args) {

//        int max=Integer.MIN_VALUE;
//        System.out.println(max);



//        for (int i = 0; i <arr1.length ; i++) {
//           if (arr1[i]>max){
//               max=arr1[i];
//           }
//
//        }
//        System.out.println(max);
        int arr1[]={1,2,3,4};

        int left[]= new int [arr1.length];
        int right[]= new int [arr1.length];
        int prodoct=1;
        left[0]=prodoct;
        for (int i = 1; i < arr1.length ; i++) {
            prodoct= prodoct * arr1[i-1];
            left[i]=prodoct;
        }
        System.out.println(Arrays.toString(left));

        prodoct=1;
        right[arr1.length-1]=prodoct;
        for (int i = arr1.length-2; i >=0 ; i--) {
            prodoct= prodoct * arr1[i+1];
            right[i]=prodoct;
        }
        System.out.println(Arrays.toString(right));
        int ans[]=new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            ans[i]=left[i]* right[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
