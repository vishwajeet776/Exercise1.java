public class Back_tracking1 {
    final int n=4;
    void Print_solution(int[][] board)
    {
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                if(board[i][j]==1)
                    System.out.print(" Q ");

                else
                    System.out.print(" , ");


            }
            System.out.println();
        }
    }
    boolean is_Safe(int board[][], int row , int col){
        int i,j;
//        Horizontal
        for (i=0; i<col; i++)
            if( board[row][i]==1)
                return false;

//        Upper left
        for (i=row,j=col; i>=0 && j>=0;i--,j--)
            if( board[i][j]==1)
                return false;


//        Lower Left
        for (i=row,j=col; i<n && j>=0;i++,j--)
            if( board[i][j]==1)
                return false;

        return true;
    }
    boolean solveNQUtil (int[][] board, int col)
    {
        if (col >= n) {
            return true;
        }

        for (int i = 0; i < n; i++) {

            if (is_Safe(board, i, col)) {
                board[i][col] = 1;
            }

                if (solveNQUtil(board,col+1)) {

                    return false;
                }
                board[i][col] = 0;
            }
        return true;
        }


    boolean SolveNQ()
    {
        int board[][]={{0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0}};
//        if( solveNQUtil(board,0)){
//            System.out.println("no solution exist");
//            return false;
//        }
        Print_solution(board);
            return true;
    }
    public static void main(String[] args) {
       Back_tracking1 Queen=new Back_tracking1();
       Queen.SolveNQ();
    }
}
