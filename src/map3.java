import java.lang.reflect.Array;
import java.util.*;

public class map3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("tab", "tap", "pat", "cat", "act"));
        Map<String, List<String>> map=new HashMap<>();
        for (String s:list) {

            char[] car=s.toCharArray();
            Arrays.sort(car);
            String temp=Arrays.toString(car);
            map.computeIfAbsent(temp,k -> new ArrayList<>()).add(s);
        }
        System.out.println(map);
    }
}
