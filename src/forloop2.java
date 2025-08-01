import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {

        System.out.println("enter a no.");
        int a= 7;
        int b= 5;
        for (int i=0;i<a;i++){
           for (int j=0;j<b;j++){
               if ((j==0 || j==1) && (i<3) ){
                   System.out.print(" * "+" ");
               }
               if (i==3){
                   System.out.print(" * "+" ");
               }
               else System.out.print(" * "+" ");
               if (j>1 && i==0){
                   System.out.print("  "+" ");
               }

           }
            System.out.println();
        }

    }
}
