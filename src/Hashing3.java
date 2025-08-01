import java.util.HashSet;

public class Hashing3 {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        int []arr1={7,3,9};
        int []arr2={6,3,9,2,9,4};
        for (int i:arr1){
            set.add(i);
        }
        for (int j:arr2){
            set.add(j);
        }
        System.out.println(set);
    }
}
