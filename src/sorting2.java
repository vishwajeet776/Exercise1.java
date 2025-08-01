

public class sorting2 {
    public static void selectionSort(int arr[]){
        for (int i=0;i< arr.length;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int arr[],int low ,int mid,int high){
        int []Merge=new int[high-low+1];
        int idx1=low;
        int idx2=mid+1;
        int x=0;
        while (idx1<=mid && idx2<= high){
            if (arr[idx1] <= arr[idx2]){
                Merge[x++]=arr[idx1++];
            }
            else {
                Merge[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            Merge[x++]=arr[idx1++];
        }
        while (idx2<=high){
            Merge[x++]=arr[idx2++];
        }
        for (int i=0,j=low; i<Merge.length ;i++,j++){
            arr[j]=Merge[i];
        }

    }
    public static void divide(int arr[],int low,int high){
        if (low>=high) return;
        int mid=(low+high)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void main(String[] args) {
        int []arr={13,40,24,52,20,9};
        selectionSort(arr);
        System.out.println();
        bubbleSort(arr);
        System.out.println();
        divide(arr,0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
