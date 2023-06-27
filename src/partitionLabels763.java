import java.util.*;
public class partitionLabels763 {
    public List<Integer> partitionLabels(String s) {
List<Integer> partitision = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            int startindex=0;
            int lastindex=s.lastIndexOf(s.charAt(startindex));
            for (int j = startindex+1; j <lastindex-1 ; j++) {
                int lastIndexOfNextChar =s.lastIndexOf(s.charAt(j));
                if (lastIndexOfNextChar>lastindex){
                    lastindex =lastIndexOfNextChar;
                }
            }
            partitision.add(lastindex-startindex+1);
            i=lastindex+1;
        }
           return partitision;
    }

}
