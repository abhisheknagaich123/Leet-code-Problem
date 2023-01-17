public class sum4 {
    public int jump(int[] nums) {
        int jump=0;
        int pos=0;
        int des=0;
        for (int i = 0; i < nums.length ; i++) {
            des=Math.max(des,nums[i]+1);
            if (pos==1){
                pos=des;
                jump++;
            }
        }
return jump;
    }
}
