import java.lang.reflect.Array;
import java.util.Arrays;

public class IP_arr2 {
    public static void main(String[] args) {
        int arr[]={5, -10, -20, 1, 2};
        int multi=0;
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                int current=arr[i]*arr[j];
//                if (multi<current)
//                    multi=current;
//            }
//        }
        Arrays.sort(arr);
        int first=arr[arr.length-1]*arr[arr.length-2];
        int secound=arr[0]*arr[1];
        multi=Math.max(first,secound);
        System.out.println(multi);
    }
}
