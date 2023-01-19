public class missingNumber {
    public int missingNumber(int[] nums) {
        int sumarr=0;
        for(int i=0; i<nums.length; i++){
            sumarr+=nums[i];
        }
        int number=nums.length;
        int expectedsum= (number*(number+1))/2;
        int res= expectedsum-sumarr;
        return res;
    }
}
