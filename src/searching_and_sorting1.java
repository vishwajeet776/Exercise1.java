public class searching_and_sorting1 {
    public static boolean isPossible(int a[],int b[],int k){
        for(int i=0;i<=a.length-1;i++){
               if (a[i]+b[i]>=k){
                   return true;
               }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={2,1,3};
        int b[]={7,8,9};
        int k =10;

        if (isPossible(a,b,k)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
