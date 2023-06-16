public class Recursion11 {
    public static int count_path(int i,int j,int n,int m){
        if (i==n||j==m){
            return 0;
        }
        if (i==n-1 && j==m-1){
            return 1;
        }
        //To count all possible path in the given matrix
         int down_path=count_path(i+1, j, n, m);
         int right_path=count_path(i, j+1, n, m);
         return down_path+right_path;
    }
    public static void main(String[] args) {
        int n; //row
        int m; //colm
        System.out.println( count_path(0,0,3,3));
    }
}
