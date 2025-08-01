import java.util.HashMap;

public class Hashing2 {
    public static void majority(int num[]){
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i=0;i<num.length;i++){
            if (map.containsKey(num[i])){
                map.put(num[i], map.get(num[i])+1);
            }
            else {
                map.put(num[i],1 );
            }
        }
        System.out.println(map);
        for (int i: map.keySet()){
            if (map.get(i)>num.length/3){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] num ={1,3,2,5,1,3,1,5,1};
       majority(num);
    }
}
