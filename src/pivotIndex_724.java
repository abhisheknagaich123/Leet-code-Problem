public class pivotIndex_724 {
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int count =1;
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            if(res==num){
                count++;
            }
            else{
                count--;
            }
            if(count ==0){
                res=num;
                count=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        int pivot=nums.length/2;
        System.out.println(nums[pivot]);
    }
}
