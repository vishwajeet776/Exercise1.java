public class Recursion2 {
    public static void fibonacci_no(int a,int b,int n){
        if(n==0){
            return;
        }

        int c=a+b;
        System.out.println(c);
        fibonacci_no(b,c,n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);

        fibonacci_no(0,1,7-2);

    }
}
