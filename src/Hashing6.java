import java.util.HashMap;

public class Hashing6 {
    public static void main(String[] args) {
        HashMap<Integer,Character> map=new HashMap<>();
        map.put(1,'I');
        map.put(5,'v');
        map.put(10,'x');
        map.put(50,'l');
        map.put(100,'c' );
        map.put(500,'d' );
        map.put(1000,'m' );
        int a=15;
        System.out.println((a%100));

    }
}
