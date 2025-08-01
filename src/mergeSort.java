import java.util.Arrays;
import java.util.Comparator;

public class mergeSort {
    public static void main(String[] args) {
       int arr[][] = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        for (int num[]:arr
             ) {
            System.out.print(" ");
            for (int x:num
                 ) {
                System.out.print(x);
            }

        }
        Arrays.sort(arr, Comparator.comparingInt(a->a[0]));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int starting=arr[i][0];
            int ending=arr[i][1];
            for (int j = i+1; j <arr.length ; j++) {
                if (ending<arr[j][0]){
                    return ;
                }
            }
        }
    }
}
