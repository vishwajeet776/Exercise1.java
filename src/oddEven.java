import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner hp=new Scanner(System.in);
        int num= hp.nextInt();
        if (num%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
