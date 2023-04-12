import java.util.Scanner;

public class function1 {
    public static int sum_of_odd_no(int n){
        int j=0;
        int a=0;
        for (int i=1;i<=n;i++){
          j= i%2;
            if (j!=0){
                a+=i;
            }
        }
        System.out.println(a);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sum_of_odd_no(n);
    }
}
