
import java.util.Scanner;

class Animal1 {
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
class Dog1 extends Animal1 {
    public void display(){
        System.out.println("my name is "+getName());
    }
    public void eat(){
        super.eat();
        System.out.println("i eat dog food ");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog1 labrador=new Dog1();
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        labrador.setName(name);
        labrador.display();
        labrador.eat();
    }
}
