import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lamda1 {
    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> l2=l1.stream()
                .filter(n->n%2==0)
                .toList();
        System.out.println(l2);
    }

}
