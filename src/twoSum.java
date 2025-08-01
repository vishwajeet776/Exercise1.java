import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class twoSum {
    public static int[] pair(int arr[],int k){
       Map<Integer,Integer> map=new HashMap<>();
       for (int i=0;i< arr.length;i++){

           int compliment=k-arr[i];

           if (map.containsKey(compliment)){
               return new int[]{map.get(compliment),i};
           }

           map.put(arr[i],i );
       }
       return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int k=9;
       int[] ans= pair(arr,k);
        for (int i:ans
             ) {
            System.out.println(i);
        }
    }
}
