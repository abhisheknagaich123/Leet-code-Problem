package java_class;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
     int arr[]= {0,1,0,3,12};
//     int j=0;
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i]!=0){
//                arr[j]=arr[i];
//                j++;
//            }
//        }
//        System.out.println(j);
//        for (int i = j; i < arr.length ; i++) {
//            arr[i]=0;
//        }
//        System.out.println(Arrays.toString(arr));
        int arr2[]=new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr2[j]=arr[i];
            }
        }
//        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));

    }
}
