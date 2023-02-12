class Solution {
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                board[i][j]='.';
            }
        }
        place(0,board,res);  
        return res;
    }
    void place(int row, char[][] board, List<List<String>> res) {
        if (row==board.length){
            res.add(construct(board));
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (validateDup(board,row,j)){
                board[row][j]='Q';
                place(row+1,board,res);
                board[row][j]='.';
            }
        }
    }

    static boolean validateDup(char[][] board, int row, int col) {
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    private static List<String> construct(char[][] board) {
        List < String > res = new ArrayList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
