package java_class;

import java.util.ArrayList;

//for (int i = 0; i < arr.length ; i++) {
//        if (i%2==0){
//        for (int j = 0; j < arr.length ; j++) {
//        list.add(arr[i][j]);
//        }
//        }
//        else {
//        for (int k = arr[0].length-1; k >=0 ; k--) {
//
//        list.add(arr[i][k]);
//        }
//        }
//        }
//        System.out.println(list);
public class ArrayBasic {
    public static void main(String[] args) {
//        int [][]arr={{1,2,3},
//                    {4,5,6},
//                    {7,8,9}};
        int[][] arr = {{10, 11, 12, 13},
                {20, 21, 22, 23},
                {30, 31, 32, 33},
                {40, 41, 42, 43}};
        ArrayList<Integer> list = new ArrayList<>();
        int row = arr.length - 1;
        int col = arr[0].length - 1;
        int left = 0, right = col, top = 0, bottom = row, d = 0;
        {
            while (left <= right && top <= bottom) {
                if (d == 0) {
                    for (int i = left; i <= right; i++) {
                        list.add(arr[top][i]);
                    }
                    top++;
                    d = 1;
                } else if (d == 1) {
                    for (int i = top; i <= bottom; i++) {
                        list.add(arr[i][right]);
                    }
                    right--;
                    d = 2;
                } else if (d == 2) {
                    for (int i = right; i >= left; i--) {
                        list.add(arr[bottom][i]);
                    }
                    bottom--;
                    d = 3;
                } else if (d == 3) {
                    for (int i = bottom; i >= top; i--) {
                        list.add(arr[i][left]);
                    }
                    left++;
                    d = 0;

                }
            }
        }


    }
}
