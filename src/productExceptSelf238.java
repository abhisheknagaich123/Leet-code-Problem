public class productExceptSelf238 {
//    public int[] productExceptSelf(int[] nums) {
//        int []left=new int[nums.length];
//        int right[]=new  int [nums.length];
//        left[0]=1;
//        for (int i = 1; i < nums.length ; i++) {
//            left[i]=left[i-1] *nums[i-1];
//        }
//        right[nums.length-1]=1;
//        for (int i = nums.length; i >-1 ; i--) {
//            right[i]=right[i+1] * right[i+1];
//        }
//        int [] ans = new int [nums.length];
//        for (int i = 0; i < nums.length ; i++) {
//            ans[i]=left[i]*nums[i];
//        }
//return ans;
//    }
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        int sum=1;
        for (int i = 0; i <nums.length ; i++) {
            sum*=nums[i];
        }
        int [] ans = new int [nums.length];
        for (int i = 0; i <nums.length ; i++) {
            ans[i]=sum/nums[i];
        }
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]);
        }



    }
}
