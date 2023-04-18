import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.println("enter "+n+" number");

        for (int i=0;i<n;i++){
             number[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i=0;i<n;i++){
           if (number[i]<min) min = number[i];

           if (number[i]>max){
               max=number[i];
           }
        }
        System.out.println("min no is -"+min);
        System.out.println("max no is -"+max);
    }
}
