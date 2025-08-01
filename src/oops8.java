
import java.util.Scanner;

class circle{
    public int radius;

    public circle(int radius) {

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    void area(){
        System.out.println(Math.PI*radius*radius);
        return;
    }
}
class Cylinder1 extends circle{
    public int height;

    public Cylinder1(int radius) {
        super(radius);
    }

    public void setHeight(int height) {
        this.height = height;
    }
    void area(int radius,int height) {

        System.out.println(height*Math.PI*radius*radius);
         return;
    }
}
public class oops8 {
    public static void main(String[] args) {
        Cylinder1 obj=new Cylinder1(7);
        circle obj2=new circle(6);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        obj2.setRadius(a);
        obj2.area();
    }
}
