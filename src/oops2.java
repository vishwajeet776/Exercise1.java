class square{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter(){
        return 4*side;
    }
}
public class oops2 {
    public static void main(String[] args) {
        square s1 =new square();
        s1.side=4;
        System.out.println("area of square is "+s1.area()+" and parameter is "+s1.parameter());
    }
}
