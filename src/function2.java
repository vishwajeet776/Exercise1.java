import java.util.Scanner;

public class function2 {
    public static void max_no(int a,int b){
        if (a<b){
            System.out.println(a+" is smaller than " +b);
        }
        else
            System.out.println(b+" is greater");
        return ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b");
        System.out.print("a-");
        int a= sc.nextInt();
        System.out.print("b-");
        int b=sc.nextInt();
        max_no(a,b);
    }
}
