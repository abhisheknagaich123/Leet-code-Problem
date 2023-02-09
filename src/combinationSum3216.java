import java.util.*;

public class combinationSum3216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> subset = new ArrayList<>() ;
         backtrcak(1 ,9,new ArrayList<>(),subset,k,n);
         return subset;
    }
    void backtrcak(int start,int end,List<Integer>current,List<List<Integer>> subset,int k,int target){
        if (target==0 && current.size()==k){
            subset.add( new ArrayList(current));
            return;
        }


        for (int i = start; i <=end ; i++) {
            current.add(i);
            backtrcak(i+1 ,end,current,subset,k,target-i);
            current.remove(current.size()-1);
        }
    }
}
