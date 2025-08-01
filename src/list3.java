import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class list3 {
    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int target=9;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement= target-arr[i];
            if (map.containsKey(arr[i])){
                System.out.println(map.get(complement)+" "+i);
            }
            else {
                map.put(arr[i],i);
            }
        }
    }
}
