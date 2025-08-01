import java.util.Scanner;

public class Hashing1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abcdabehzf";
        int[] arr =new int[26];
        for (int i=0;i<s.length();i++){
            arr[(s.charAt(i)-'a')]++;
        }
        int num=sc.nextInt();
        for (int i=0;i<=num;i++) {
            char ch = sc.next().charAt(0);
            System.out.println(arr[ch-'a']);
        }
    }
}
