public class Recursion1 {
    public static void print_sum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum +=n;
        print_sum(n-1,sum);
    }
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        print_sum(n,sum);
    }
}
