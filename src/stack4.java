import java.util.Scanner;
import java.util.Stack;

public class stack4 {
    public static void main(String[] args) {
        String[] arr={"2", "3", "1", "*", "+", "9", "-"};
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].matches("-?\\d+")){
                stack.push(Integer.parseInt(arr[i]));
            }else {
                int num2=stack.pop();
                int num1=stack.pop();
                switch (arr[i]){
                    case"+":
                        stack.push(num1+num2);
                        break;
                    case"-":
                        stack.push(num1-num2);
                        break;
                    case"*":
                        stack.push((num1*num2));
                        break;
                    case"/":
                        stack.push(num1/num2);
                        break;
                }

            }

        }
        System.out.println(stack.pop());
    }
}
