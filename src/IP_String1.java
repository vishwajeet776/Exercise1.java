import java.util.ArrayList;
import java.util.HashMap;

public class IP_String1 {
    public static void main(String[] args) {
        String s="swiss";
        HashMap<Character,Integer> map=new HashMap<>();
        char [] ch= s.toCharArray();
        for (char c:ch) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c:ch
             ) {
             if (map.get(c)==1){
                 System.out.println(c);
                 break;
             }

        }
        System.out.println(map.keySet());
        ArrayList<Integer> arr=new ArrayList<>();

    }
}
