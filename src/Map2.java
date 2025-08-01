import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        String s = "aabbbccdeee";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character ch : s.toCharArray()
        ) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        int max = Integer.MIN_VALUE;
        Set<Map.Entry<Character, Integer>> it = map.entrySet();
        for (Map.Entry<Character, Integer> ans : map.entrySet()
        ) {
            if (ans.getValue() > max) {
                max = ans.getValue();
            }
        }
        System.out.println(max);
        System.out.println(map.keySet());
        for (Map.Entry<Character, Integer> ans : map.entrySet()
        ) {
            if (ans.getValue()==1) {
                System.out.println(ans.getKey());
                break;
            }
        }
        Set<Integer> set =new HashSet<>(map.values());
        System.out.println("map values : "+ set);
        Iterator it2= set.iterator();
        while(it2.hasNext()){
//            Map<>
        }
    }

}
