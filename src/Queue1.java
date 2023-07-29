import java.util.Stack;

//Queue using 2 stack
public class Queue1 {
    static class queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean is_empty(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            return s1.pop();
        }
        public static int peek(){
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        queue Q=new queue();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        while (!Q.is_empty()){
            System.out.println(Q.peek());
            Q.remove();
        }

    }
}
