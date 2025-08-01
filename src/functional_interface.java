import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface NumberCheck{
    boolean even(int n);
}
interface StringCheck{
    boolean length(String s);
}
public class functional_interface {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10};
        NumberCheck isEven=(n -> n%2==0);
        for (int n:num
             ) {
            System.out.println(n +" even "+ isEven.even(n));
        }
        String temp="kajwbljfblekvb";
        StringCheck length=(s -> s.length() > 5);
        System.out.println(length.length(temp));
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> newList= newList=list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> list2=list.stream()
                .map(n->n*n)
                .toList();
        System.out.println(list2);
    }

}
