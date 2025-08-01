import java.util.Stack;

public class EvaluationOfPostfixExpression {
    public static void main(String[] args) {
        String[] arr ={"2", "3", "1", "*", "+", "9", "-"};

        Stack<Integer> str=new Stack<>();

        for (String s:arr) {
            if (s.matches("-?\\d+")) {
                str.push(Integer.parseInt(s));
            }else {
                int n1=str.pop();
                int n2=str.pop();
                switch (s){
                    case "+":
                        str.push(n2+n1);
                        break;
                    case "-":
                        str.push(n2-n1);
                        break;
                    case "*":
                        str.push(n2*n1);
                        break;
                    case "/":
                        str.push(n2/n1);
                        break;
                }
            }
        }

        System.out.println(str.peek());

    }
}
