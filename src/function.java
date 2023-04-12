import java.util.Scanner;

public class function {
    public static int avg(int a,int b, int c){
        int d=0;
        d=(a+b+c)/3;
        System.out.println("avg is. "+d);
        return d;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 3 no. ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        avg(a,b,c);

    }
}
