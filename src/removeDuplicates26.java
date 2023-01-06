public class removeDuplicates26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int current=nums[0];
        int count=1;
        for (int i = 0; i <nums.length ; i++) {
            if (current==nums[i]) continue;
            else {
                nums[count]=nums[i];
                current=nums[i];
                count++;
            }

//            if (nums[i]<nums[i+1]){
//                nums[count]=nums[i+1];
//                count++;
//            }

        }
        return count;
    }
}
