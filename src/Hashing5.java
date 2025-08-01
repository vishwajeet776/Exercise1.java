import java.util.HashMap;
import java.util.Scanner;

public class Hashing5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('v',5);
        map.put('x',10);
        map.put('l',50);
        map.put('c',100);
        map.put('d',500);
        map.put('m',1000);
        System.out.println(map);
        String rom=sc.next();
        int num=0;
        for (int i=0;i<rom.length();i++){
            if (i<rom.length()-1 && map.get(rom.charAt(i))<map.get(rom.charAt(i+1))){
                num-= map.get(rom.charAt(i));
            }
            else {
                num+=map.get(rom.charAt(i));
            }
        }
        System.out.println(num);

    }
}
