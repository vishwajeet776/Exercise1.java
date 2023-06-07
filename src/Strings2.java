import java.util.Scanner;

public class Strings2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your email");
        String Ur_name= sc.next();
        System.out.println(Ur_name);
        System.out.print("your user name is -");
        for (int i=0;i<Ur_name.length();i++){

            if(Ur_name.charAt(i)=='@'){

                break;

            }
            else{
                System.out.print(Ur_name.charAt(i));
            }
        }
    }
}
