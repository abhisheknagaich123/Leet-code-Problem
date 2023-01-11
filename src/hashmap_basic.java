import java.util.*;

public class hashmap_basic {
    public static void main(String[] args) {


        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
       map.put(4,"four");
//        System.out.println(map);
        HashMap<Integer,String> hash_map2 = new HashMap<Integer,String>();

        hash_map2.put(4,"white");
        hash_map2.put(5,"blue");
        hash_map2.put(6,"orange");
        hash_map2.putAll(map);
//        System.out.println(hash_map2);
       if (hash_map2.containsKey(10)){
           System.out.println("yes");
       }
       else {
           System.out.println("no");
       }

    }
}
