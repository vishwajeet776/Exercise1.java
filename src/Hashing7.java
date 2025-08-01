import java.util.HashMap;

public class Hashing7 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int count=1;
        for (int i=0;i< nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1 );
                count++;
            }
            else map.put(nums[i], 1);
        }
       if (count>1){
           return true;
       }
       return false;
    }
    public static void main(String[] args) {
        int []nums={1,2,3,1};
        if(containsDuplicate(nums)) System.out.println(" contains key");;
    }
}
