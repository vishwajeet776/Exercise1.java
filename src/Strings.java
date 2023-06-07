import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int size=sc.nextInt();
        int tothelength=0;
        String name[]=new String[size];
        System.out.println("enter "+size+" leter");
        for (int i=0;i<size;i++){
             name[i]=sc.next();
             tothelength+= name[i].length();
        }
       for (int i=0;i<size;i++){
           System.out.print(name[i]);
       }
        System.out.println();
        System.out.println(tothelength);
    }
}
