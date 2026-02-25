class Solution {
    public int totalNQueens(int n) {
        boolean[][] visited=new boolean[n][n];
        return helper(visited,0);
    }
    int helper(boolean[][] board,int row){
        if(row==board.length){
            
            return 1;
        }
        int count=0;
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]=true;
                count+=helper(board,row+1);
                board[row][i]=false;
            }
        }
        return count;
    }
     boolean isSafe(boolean[][] board,int row ,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }
}