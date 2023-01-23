public class pivotIndex724 {
    public int pivotIndex(int[] nums) {
        int sum_left=0, sum_total=0;
        int len = nums.length;
        for(int i=0 ; i<len ; i++){
            sum_total+=nums[i];
        }
        for(int i=0 ; i<len ; i++){
            if((sum_total-sum_left-nums[i])==sum_left){
                return i;
            }
            sum_left+=nums[i];
        }
        return -1;
    }
}
