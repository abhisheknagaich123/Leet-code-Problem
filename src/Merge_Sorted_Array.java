import java.lang.reflect.Array;

import java.util.Arrays;
public class Merge_Sorted_Array {
    public static void main(String[] args)
    {
        int a[]={1,2,3,0,0,0};
        int b[]={2,5,6};
        int temp=0;
        int j=0;
        for (int i = 3; i <a.length; i++) {
            a[i]=b[j];
            j++;
        }
//        for (int i = 0; i <a.length ; i++) {
//            for (int k = i+1; k < a.length; k++) {
//                if (a[i]>a[k]){
//                   temp=a[i];
//                   a[i]=a[k];
//                   a[k]=temp;
//                }
//            }
//        }
        Arrays.sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
