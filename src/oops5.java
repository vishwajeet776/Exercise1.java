import java.util.Scanner;

class Cylinder{
    private int r;
    private int h;
    public Cylinder(){
        this.r=r;
        this.h=h;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double surfaceArea(){
        return 2*Math.PI*r;
    }
    public double volume(){
        return Math.PI*r*h;
    }
}
public class oops5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cylinder c1=new Cylinder();
        System.out.println("enter radius");
        int n= sc.nextInt();
        c1.setR(n);
        System.out.println(c1.getR());
        System.out.println("enter height");
        int m= sc.nextInt();
        c1.setH(m);
        System.out.println(c1.getH());

        System.out.println( "area is "+c1.surfaceArea());
        System.out.println("volume is "+c1.volume());
    }
}
