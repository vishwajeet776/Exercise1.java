import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map1 {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<>();
        student.put(23,"Rohan");
        student.put(24,"Sham");
        student.put(56,"rihan");
        student.put(43,"Ramesh");
        student.put(92,"Komal");
        System.out.println(student);
        Set<Map.Entry<Integer,String>> entry=student.entrySet();
        for (Map.Entry<Integer,String> entries:entry
             ) {
            System.out.println(entries.getKey()+" "+entries.getValue());
        }
    }
}
