public class searchInsert35 {
    public static void main(String[] args) {
        int []nums = {1,3,5,6,10}; int target = 7;
        for (int i = 0; i < nums.length ; i++) {
                if (nums[i]==target ){
                    System.out.println(i);
                    break;
                }
                if (nums[i]>target) {
                    System.out.println(i);
                    break;
                }
        }
    }
}
