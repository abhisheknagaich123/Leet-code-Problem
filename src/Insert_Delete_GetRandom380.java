import java.util.*;

public class Insert_Delete_GetRandom380 {
    HashMap<Integer ,Integer > hashMap;
    List<Integer> list;
//    public RandomizedSet() {
//        hashMap =new HashMap<>();
//               list = new ArrayList<>();
//               return ;
//    }

    public boolean insert(int val) {
        if(hashMap.containsKey(val)) return false;
            list.add(val);
            hashMap.put(val,list.size()-1);
            return true;


    }

    public boolean remove(int val) {
        if(hashMap.containsKey(val) == false) return false;
        list.add(val);
        int inf =hashMap.get(val);
        Collections.swap(list,inf,list.size()-1);
        int swap=list.get(inf);

        hashMap.put(swap,inf);
        list.remove(list.size()-1);
        hashMap.remove(val);
        return true;

    }

    public int getRandom() {
        Random random=new Random();
        int n= random.nextInt(list.size());
  return list.get(n);
    }
}
