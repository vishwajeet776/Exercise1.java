
public class IP_arr3 {
    public static int Kadane (int arr[],int start,int end){
        int sum=0;
        for (int i = start; i <= end ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max_sum=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
               max_sum=Math.max(max_sum, Kadane ( arr,i,j));

            }
        }
        System.out.println(max_sum);
    }
}
