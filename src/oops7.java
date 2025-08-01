class practice{
    int x;
    public int getX() {
        return x;
    }
    practice(int x){
       this.x =x;
    }
}
public class oops7 {
    public static void main(String[] args) {
     practice obj1=new practice(6);
        System.out.println(obj1.getX());
    }
}
