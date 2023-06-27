import java.util.Stack;

public class isValid {
     boolean isValid(String s) {

        Stack<Character> stack= new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curnentchar=s.charAt(i);
            if (isopening(curnentchar)){
                stack.push(curnentchar);

            }
            else {
                if (stack.isEmpty()) return false;
                else if (!ismacting(stack.peek(),curnentchar)) {
                    return false;

                }
                stack.pop();
            }

        }
        return true;


    }
    boolean isopening(char c){
       return c=='('|| c== '{' || c=='[';

    }
    boolean ismacting(char a ,char c){
         return (a=='[' &&  c==']')|| (a=='(' && c==')')||(a=='{' && c =='}');
    }

//    public static void main(String[] args) {
//        isValid obj= new isValid();
//        obj.isValid("()[]{}");
//    }
public static void main(String[] args) {

}



}
