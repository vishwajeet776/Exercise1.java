public class Recursion7 {
    public static boolean is_sorted(int arr[],int n){
        if(n==arr.length-1){
            return true ;
        }
        if(arr[n] < arr[n+1]){
            return is_sorted(arr,n+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,5};

        System.out.println(is_sorted(arr,0));

    }
}
