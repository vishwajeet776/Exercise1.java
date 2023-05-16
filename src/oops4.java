import java.util.Scanner;

class Game{
    private int counter;
    private int my_no;
    private int camp_no;
    public Game(){
        camp_no=(int)(Math.random()*10);
    }

    public void setMy_no(int my_no) {
        this.my_no = my_no;
    }
    public int correct(){
        if(my_no==camp_no){
            return 0;
        } else if (my_no>camp_no) {
            return -1;
        }
        else {
            return 1;
        }
    }
    public void setCounter(){
        counter++;
    }
    public void getCounter(){
        System.out.println("this no. of gusess where "+counter);
    }
}
public class oops4 {
    public static void main(String[] args) {
        Game obj =new Game();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("enter a no from 1-10");
            int n=sc.nextInt();
            obj.setMy_no(n);
            if (obj.correct()==0){
                obj.setCounter();
                System.out.println("no. is correct");
                obj.setCounter();
                break;
            } else if (obj.correct()==-1) {
                obj.setCounter();
                System.out.println("enter smaller no");
            }
            else if (obj.correct()==1) {
                obj.setCounter();
                System.out.println("enter greater no");
            }
        }
    }
}
