package java_class;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//        10 11 12 13
//        20 21 22 23
//        30 31 32 33
//        40 41 42 43
import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
//        int [][]arr=new int[3][3];
    int [][]arr={{10,11,12,13},
                {20,21,22,23},
                {30,31,32,33},
                {40,41,42,43}};
//    int target=21;
//
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr.length ; j++) {
//               if (arr[i][j]==target){
//                   System.out.println();
//               }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        ArrayList<Integer>list=new ArrayList();

        for (int i = 0; i <arr[0].length ; i++) {
            int row=0;
            int col=i;
            while (col>=0){
                list.add(arr[row][col]);
                col--;
                row++;
            }
        }
//        System.out.println(list);
        for (int i = 1; i <arr.length ; i++) {
            int row=i;
            int col=arr[0].length-1;
            while (row<arr.length){
                list.add(arr[row][col]);
                col--;
                row++;
            }
        }
        System.out.println(list);

    }
}
//1 2 3
//4 5 6
//7 8 9