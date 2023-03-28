import java.util.Scanner;

public class forloop1 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int a = sc.nextInt();
        int c= 0;
        for (int i=1;i<=a;i++){
//            System.out.println(i);
           c=c+i;
            System.out.print(i+"+");
        }
        System.out.println(c);

    }

}
