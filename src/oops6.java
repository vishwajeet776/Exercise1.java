import java.util.Scanner;

class animal{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("i can eat");
    }
}
class dog extends animal{
    public void display(){
        System.out.println("my name is "+getName());
    }
}
public class oops6 {
    public static void main(String[] args) {
        dog labrador=new dog();
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        labrador.setName(name);
        labrador.display();
        labrador.eat();
    }
}
