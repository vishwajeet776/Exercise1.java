import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.println("enter operator :-> 1=add,2=sub,3=mul,4=div");
        int operator = no.nextInt();
        System.out.println("enter 1st no.");
        int a = no.nextInt();
        System.out.println("enter 2nd no.");
        int b = no.nextInt();
        int c=0;
        switch (operator){
            case 1:
                c= a+b;
                System.out.println(a + "+"+ b + "=" + c);
            break;
            case 2:
                c=a-b;
                System.out.println(a + "-"+ b + "=" + c);
                break;
            case 3:
                c=a*b;
                System.out.println(a + "x"+ b + "=" + c);
                break;
            case 4:
                c=a/b;
                System.out.println(a + "/"+ b + "=" + c);
                break;
            default:
                System.out.println("invalid");
        }
    }
}
