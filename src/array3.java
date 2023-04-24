import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size off arr");
        int n=sc.nextInt();
        int[] number= new int[n];
        for (int i=0;i < n;i++){
            System.out.print("enter "+i+"no.");
            number[i]=sc.nextInt();
        }
        System.out.print("ascending order is--");
        for (int i=0;i < n;i++){
            for (int j=i+1;j<n;j++){
                if ( number[i]>number[j]){
                    int temp=0;
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }

            System.out.print(number[i]+",");
        }
        System.out.println();
        System.out.print("descending order is--");
        for (int i=0;i < n;i++){
            for (int j=i+1;j<n;j++){
                if ( number[i]<number[j]){
                    int temp=0;
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
            System.out.print(number[i]+",");
        }
    }
}
