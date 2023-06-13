public class Recursion5 {
    public static void reverse_string(String name,int n){
        if(n==0){
            System.out.println(name.charAt(n));
            return;
        }
        System.out.println(name.charAt(n));
        reverse_string(name,n-1);
    }
    public static void main(String[] args) {
        String name="vishwajeet";
        reverse_string(name,name.length()-1);
    }
}
