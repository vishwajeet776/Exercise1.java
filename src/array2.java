import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.println("enter " + n + " number");

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        for (int i =n; i >0; i--)
            System.out.print(number[i-1]+",");
    }
}
