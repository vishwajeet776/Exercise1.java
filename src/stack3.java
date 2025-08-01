import java.util.Arrays;
import java.util.Stack;

public class stack3 {
    public static void main(String[] args) {
        String s="{[()]}]{";
        Stack<Character> s1=new Stack<>();

        char[] ch= s.toCharArray();
        boolean ans=true;
        for (char c:ch
             ) {
            if (c == '[' || c=='{' || c== '('){
                s1.push(c);
            }
            else {
                char current= s1.pop();
                if ((c==']' && current!= '[') || (c==')' && current!= '(') || (c=='}' && current!= '{') ){
                    ans=false;
                    break;
                }
            }
        }
        if (ans){
            System.out.println("is valid");
        }

    }
}
