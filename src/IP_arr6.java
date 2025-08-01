import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class IP_arr6 {
    public static void main(String[] args) {
        int []list1={1, 2, 3, 4, 5};
        int []list2={3, 4, 5, 6, 7};
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i:list1
             ) {
            arr.add(i);
        }
        for (int i:list2
        ) {
            if (arr.contains(i)){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
