package java_class;

import java.util.ArrayList;

public class intersection {
    public static void main(String[] args) {
       int [] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                if (nums1[i]==nums2[j]){
                    if (!list.contains(nums1[i])){
                        list.add(nums1[i]);
                    }
                }
            }
        }
        System.out.println(list);

    }
}
