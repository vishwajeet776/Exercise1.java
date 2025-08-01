import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String,List<String>> map=new HashMap<>();
        for (String temp:list
             ) {
            char[] chr=temp.toCharArray();
            Arrays.sort(chr);
            String sorted=chr.toString();
            map.computeIfAbsent(sorted,k->new ArrayList<>()).add(temp);

        }
        List<List<String>> result= (List<List<String>>)map.values();
        for (List<String> strGroup:result
             ) {
            System.out.println(strGroup);
        }
    }
}
