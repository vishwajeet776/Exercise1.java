import java.util.Random;
import java.util.Scanner;

public class rockpaperscissorgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter-->0 for rock ");
        System.out.println("enter-->1 for paper ");
        System.out.println("enter-->2 for scissor ");
        int use = sc.nextInt();
        Random rad = new Random();
        int com = rad.nextInt(3);
        System.out.println(com);
            if (use==com){
                System.out.println("same no");
            } else if (use==0&&com==1) {
                System.out.println("rock vs paper");
                System.out.println("you loos");

            } else if (use==0&&com==2) {
                System.out.println("rock vs scissor");
                System.out.println("you win");
            }
            else if (use==1&&com==0) {
                System.out.println("paper vs rock");
                System.out.println("you win");
            }
            else if (use==1&&com==2) {
                System.out.println("paper vs scissor");
                System.out.println("you loos");
            }
            else if (use==2&&com==0) {
                System.out.println("scissor vs rock");
                System.out.println("you loos");
            }
            else if (use==2&&com==1) {
                System.out.println("scissor vs paper");
                System.out.println("you win");
            }
            else {
                System.out.println("wrong no.");
            }
            }
    }


