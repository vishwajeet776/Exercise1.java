import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IP_arr7 {

      public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 2, 4, 6));
            int n=4;
            Iterator<Integer> itretor=list.iterator();
            while (itretor.hasNext()){
                  if (itretor.next()>n){
                        itretor.remove();
                  }
            }
            System.out.println(list);
            String s="";
            s+="a";

      }



}
