import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        int count=0;
        int c=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for (int i=0;i < n;i++){
            numbers[i]=sc.nextInt();
        }
        for (int i=0;i < n;i++){
            System.out.println(numbers[i]);
            for (int j=i+1;j<n;j++){
                if(numbers[i]==numbers[j]){
                    count++;
                    c=numbers[i];
                }
            }
        }
        System.out.println("count of "+ c +" is "+count);
    }
}
