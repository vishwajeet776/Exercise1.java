import java.util.Scanner;

public class conditions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("for quadratic equation");
        System.out.println("a=");
        double a = sc.nextInt();
        System.out.println("b=");
        double b = sc.nextInt();
        System.out.println("c=");
        double c = sc.nextInt();
        double r1=0;
        double r2=0;
        double d=b*b-4*a*c;
        double sr = Math.sqrt(d) ;
        System.out.println(sr);

        if (d>0)
        {
            r1=(-b+sr)/(2*a);
            r2 = (-b - sr) / (2 * a);
            System.out.println("roots are"+ r1 +"and" +r2);
        } else if (d==0) {

            r1=(-b+sr)/(2*a);
            System.out.println("the root is"+r1);
        }
        else{
            System.out.println("equation ha no roots");
        }

//        System.out.println(r1);
//        System.out.println(r2);
    }

}
