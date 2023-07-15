public class Jump_55 {
   public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        int n=nums.length-1;
        if (n==1){
            System.out.println("true");
            //return true;
            int max=0;
            for (int i = 0; i <n-1 && max>=i; i++) {
                if (max < i+nums[i]){
                    max=i+nums[i];
                }
                if (max > n-1){

                }
            }
        }

  }
}
