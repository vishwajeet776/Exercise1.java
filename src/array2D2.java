import java.util.Scanner;

public class array2D2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
        int matrix[][]=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j <m; j++) {
                matrix[i][j]= sc.nextInt();
             }
        }
        for (int c=0;c<n*m;c++) {
            for (int j = 0; j < m; j++) {
                for ( int i = 0; i < n; i++) {
                    if (i + j == c) {
                        System.out.print(matrix[i][j]+" ");
                    }

                }

            }
            System.out.println();
        }

    }

}
