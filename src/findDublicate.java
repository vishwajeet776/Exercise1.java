import java.util.*;
public class findDublicate {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        for (Map.Entry<Integer,Integer> temp:map.entrySet()
             ) {
            if (temp.getValue()>1){
               
            }
        }
    }
}
