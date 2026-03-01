class Solution {
    public boolean isValidSudoku(char[][] board) {
        return solve(board);
    }
    static boolean solve(char[][] board){
         for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'0';
                    char temp=board[i][j];
                    board[i][j]='.';
                    if(!isSafe(board,i,j,num)){
                        return false;
                    }
                    board[i][j]=temp;
                }
                
            }
         }
       
        return true;
    }
    static boolean isSafe(char[][] board,int row,int col,int num){
        char ch=(char)(num+'0');
        for(int i=0;i< board.length;i++){
            if(board[row][i]==ch){
                return false;
            }
        }

        for(int i=0;i< board.length;i++){
            if(board[i][col]==ch){
                return false;
            }
        }

        int sqrt=(int)(Math.sqrt(board.length));
        int rowstart =row-row%sqrt;
        int colstart=col-col%sqrt;
        for(int r = rowstart; r< rowstart +sqrt; r++){
            for(int c=colstart;c<colstart+sqrt;c++){
                if(board[r][c]==ch){
                    return false;
                }
            }
        }
        return true;
    }
}