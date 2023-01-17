import java.util.Arrays;

public class findPairs532 {
    public static void main(String[] args) {

       int nums []= {3,1,4,1,5 };
        Arrays.sort(nums);
       int  k = 2;
       int count=0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[j]-nums[i]==k){
                    count++;
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}
