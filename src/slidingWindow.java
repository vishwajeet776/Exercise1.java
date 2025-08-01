public class slidingWindow {
    public static void main(String[] args) {
        int num[]={2, 1, 5, 1, 3, 2};
        int k=3;
//        sum of 1st 3 elements
        int MaxSum =0;
        int sum=MaxSum;
        for (int i = 0; i < k; i++) {
            MaxSum+=num[i];
        }
        for (int i = k; i < num.length; i++) {
            MaxSum+=num[i]-num[k-i];
            sum=Math.max(MaxSum,sum);
        }


        
    }
}
