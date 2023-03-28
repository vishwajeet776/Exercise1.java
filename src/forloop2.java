import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int a= sc.nextInt();
        int b;
        for (int i=0;i<=10;i++){
            b=a*i;
            System.out.println(b);
        }

    }
}
