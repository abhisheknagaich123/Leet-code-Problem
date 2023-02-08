import java.util.*;
public class generateParenthesis22 {
    public List<String> generateParenthesis(int n) {
        List<String>  answer = new ArrayList<>();
       backtrack("(",1,0,answer,n);
        return answer;
    }
    void backtrack(String current,int open,int clouse,List<String> answer,int n){
        if (current.length()==2*n){
            answer.add(current);
            return;
        }
        if (open<n){
            backtrack( current+"(", open+1, clouse, answer, n);
        }
        if (clouse<open){
            backtrack( current+"(", open, clouse+1, answer, n);
        }
    }
}
