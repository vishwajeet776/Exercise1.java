import java.util.Scanner;

public class array2D1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for (int i=0;i<n;i++){

           if (i==0) {
               for (int j = 0; j < m; j++) {
                   System.out.print(matrix[i][j] + " ");
               }
               c++;
           }

           if (i==1) {
               for (int j = m - 1; j >= 0; j--) {
                   System.out.print(matrix[i][j] + " ");
               }
               c++;
           }
            if (i==2) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                c++;
            }

            if (i==c) {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
                c++;
            }
            System.out.println();
        }
    }
}
