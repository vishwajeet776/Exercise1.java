import java.util.Scanner;

public class Strings3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        String b=" ";
        System.out.println(a);
        System.out.println(a.length());
        for(int i=a.length()-1;i>=0;i--){

            b+=a.charAt(i);

        }
        System.out.println(b);
        if (b.equals(a)) {
            System.out.println("is palindrome");
        }
        else {
            System.out.println("Not ");
        }
    }
}
