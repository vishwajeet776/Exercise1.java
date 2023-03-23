import java.util.Scanner;

public class percentage {
    public static void main(String[]arg){
        System.out.println("hii");
        Scanner mar = new Scanner(System.in);
        //Question 1
        System.out.println("enter marks");
        System.out.println("Maths");
        int a = mar.nextInt();
        System.out.println("English");
        int b= mar.nextInt();
        System.out.println("Science");
        int c= mar.nextInt();
        float d = 300;
        float sum=a+b+c;
        System.out.println("total marks  " + sum);
        float div=(sum/d)*100;
        System.out.println("Percentage is " + div);

        //Question 2
        Scanner nav = new Scanner(System.in);
        System.out.println("enter name");
        String n= nav.next();
        System.out.println(n);

        //Question 3

        System.out.println("enter any no.");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());


    }
}
