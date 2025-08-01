import java.util.Scanner;

public class array5 {
    public static void min_(int arr[],int n){
        int min=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>=arr[j]){
                    min=arr[j];
                }
            }
        }
        System.out.println("Minimum no. in arr is "+min);
    }
    public static void max_(int arr[],int n){
        int max=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]<=arr[j]){
                    max=arr[j];
                }
            }
        }
        System.out.println("Maximum no. in arr is "+max);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter arr size");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter arr of size "+n);

        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Enter '<' for min no. & '>' for max");
        char a=sc.next().charAt(0);
        switch (a){
            case '<':
                min_(arr,n);
                break;
            case '>':
                max_(arr,n);
                break;
        }

    }
}
