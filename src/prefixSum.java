public class prefixSum {
    public static int inRange(int left,int right,int[] arr){
        int sum=0;

        int[] printSum=new int[arr.length];
        printSum[0]=arr[left];

        for (int i = left+1; i < right ; i++) {
            printSum[left]=printSum[i-1]+arr[i];
        }

        return printSum[right];
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};

        System.out.println(inRange(1,3,nums));

//        int[] prifixSum=new int[nums.length];
//
//        prifixSum[0]=nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            prifixSum[i]=prifixSum[i-1]+nums[i];
//        }
//
//        for (int n:prifixSum
//             ) {
//            System.out.print(n+" ");
//        }
    }
}
