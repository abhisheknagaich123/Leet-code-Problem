import java.util.Arrays;

public class findDuplicate287 {
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        Arrays.sort(nums);
        int res=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                    if (nums[i]==nums[j]){
                       res=nums[i];
                    }
            }
        }
        System.out.println(res);
    }
}
