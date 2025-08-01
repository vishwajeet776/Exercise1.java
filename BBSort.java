public class BBSort {
    public static void main(String[] args) {
        int[] arr={4,2,6,3,9,1};
        for (int i = 0; i < arr.length-1; i++) {
            int current= arr[i];
            if (current>arr[i++]){
                int temp=current;
                current=arr[i++];
                arr[i++]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            }
        }

//        i water tank.3pipline ,ab inlet,c out
//        a=10
//        b=12
//          c=30 e

    }
}
