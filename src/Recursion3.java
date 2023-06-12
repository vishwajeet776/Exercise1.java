public class Recursion3 {
    public static void power(int x,int n,int mul){
        if (n==0){
            return;
        }
        mul*=x;
        System.out.println(mul);
        power(x,n-1,mul);
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int mul=1;
        power(x,n,mul);

    }
}
