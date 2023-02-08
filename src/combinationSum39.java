import java.util.*;
public class combinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidate, int target) {
        List<List<Integer>> comb=new ArrayList<>();
        generatecomb(0,candidate,new ArrayList<Integer>(),comb,target);
        return comb;
    }
    void generatecomb(int start,int[] nums,List<Integer> current,List<List<Integer>> comb,int target){

        if (target==0){
            comb.add(new ArrayList<>(current));
        }
        if (target<0){
            return;
        }
        for (int i = start; i <nums.length ; i++) {
            current.add(nums[i]);
            generatecomb(i,nums,current,comb,target-nums[i]);
            current.remove(current.size()-1);
        }
    }
}
