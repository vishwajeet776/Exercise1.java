import java.util.HashSet;

public class Hashing4 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int []arr1={7,3,9};
        int []arr2={6,3,9,2,9,4};
        for (int i:arr1){
            set.add(i);
        }
        int count=0;
        for (int j:arr2){
            if (set.contains(j)){
                count++;
                System.out.print(j);
                set.remove(j);
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
