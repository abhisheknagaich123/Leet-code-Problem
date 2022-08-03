import java.util.Scanner;

public class leetcode {
    public static void main(String[] args) {
        int arr[]={1,1,0,0,0,2,5,6};
        int count=0;
        int sum=0;
        int add=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }
            if (arr[i]==0){
                sum++;
            }
            if(arr[i]>=1){
               add+=arr[i];
            }
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(add);
    }
}
