import java.util.*;

public class list2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5, 1, 3, 3, 5, 2, 3, 4, 1);
        Set<Integer> set=new HashSet<>();
        int left=0,right=0,MaxL=0;
        while(right<list.size()){
            if (!set.contains(list.get(right))){
                set.add(right);
                MaxL=Math.max(MaxL,(right-left+1));
                right++;
            }else {
                set.remove(left);
                left++;
            }
        }
    }
}
