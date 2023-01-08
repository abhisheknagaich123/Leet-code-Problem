public class productExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int []left=new int[nums.length];
        int right[]=new  int [nums.length];
        left[0]=1;
        for (int i = 1; i < nums.length ; i++) {
            left[i]=left[i-1] *left[i-1];
        }
        right[nums.length-1]=1;
        for (int i = nums.length; i >-1 ; i--) {
            right[i]=right[i+1] * right[i+1];
        }
        int [] ans = new int [nums.length];
        for (int i = 0; i < nums.length ; i++) {
            ans[i]=left[i]*right[i];
        }
return ans;
    }
    public static void main(String[] args) {


    }
}
