package java_class;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
//        10 11 12 13
//        20 21 22 23
//        30 31 32 33
//        40 41 42 43

public class Array_2D {
    public static void main(String[] args) {
//        int [][]arr=new int[3][3];
//        System.out.println(Arrays.toString(arr[0]));
        int [][]arr={{10,11,12,13},{20,21,22,23},{30,31,32,33},{40,41,42,43}};

        for (int j = 0; j <4; j++) {
            //if (i%10==0){
                for (int i = 0; i <4; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            //}
//            else {
//                for (int j = arr.length; j >=0; j--) {
//                    System.out.print(arr[j][i]+" ");
//                }
//            }

            System.out.println();

        }




//        for (int a = 0; a <arr.length ; a++) {
//            for (int i = 0; i < arr.length ;i++) {
//                System.out.print(arr[a][i]+" ");
//            }
//            System.out.println();
//        }

    }
}
//1 2 3
//4 5 6
//7 8 9