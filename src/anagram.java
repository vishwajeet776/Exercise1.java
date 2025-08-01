import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        String s1="anagram";
        String s2="nagaram";
        char[] str1=s1.toCharArray();
        Arrays.sort(str1);
        char[] str2=s2.toCharArray();
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)) {
            System.out.println("String are anagram");
        }
        else {
            System.out.println("Not");
        }

        Map<Character,Integer> map=new HashMap<>();
        for (char i: s1.toCharArray()
             ) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
    }
}
