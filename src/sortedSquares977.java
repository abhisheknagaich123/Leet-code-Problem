import java.util.Arrays;

public class sortedSquares977 {
//    public int[] sortedSquares(int[] nums) {
//
//
//    }
public int[] sortedSquares(int[] nums) {
    int [] res=new int [nums.length];
    for (int i = 0; i <nums.length ; i++) {
        nums[i]=nums[i]*nums[i];
    }
    int head=0;
    int tail=nums.length-1;
    for(int i=nums.length-1; i>=0; i--){
        if(nums[head]>nums[tail]){
            res[i]=nums[head];
            head++;
        }
        else{
            res[i]=nums[tail];
            tail--;
        }
    }
    return res;
}
public static void main(String[] args) {
    int nums[] = {-4,-1,0,3,10};
    for (int i = 0; i <nums.length ; i++) {
        nums[i]=nums[i]*nums[i];
    }
    Arrays.sort(nums);
    for (int i = 0; i <nums.length ; i++) {
        System.out.print("["+nums[i]+"]");
    }
}
}
