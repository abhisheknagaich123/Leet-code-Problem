import java.lang.reflect.Array;

import java.util.Arrays;
public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1= m-1;
        int p2=n-1;
        int i=n+m-1;
        while (p2>=0){
            if (p1>=0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--]=nums2[p2--];
            }
        }

    }
    public static void main(String[] args)
    {
        Merge_Sorted_Array obj= new Merge_Sorted_Array();
      int []  nums1 = {1,2,3,0,0,0};
      int  m = 3;
      int [] nums2 = {2,5,6};
      int n=3;
      obj.merge(nums1,m,nums2,n);
        for (int i = 0; i <nums1.length ; i++) {
            System.out.print(nums1[i]+" ");
        }


    }
}
