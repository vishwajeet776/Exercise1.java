import java.util.ArrayList;

public class IP_arr5 {
    public static void main(String[] args) {
       int[] list = {1, 2, 3, 2, 4, 1, 5};
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i:list
             ) {
            if (!arr.contains(i)){
                arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
