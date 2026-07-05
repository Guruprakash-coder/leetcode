class Solution {
    private static int[][] DIR={
        {0,1},
        {0,-1},
        {1,0},
        {-1,0}
    };
    public void solve(char[][] board) {
       for(int i=0;i<board[0].length;i++){
        if(board[0][i]=='O'){
            dfs(board,0,i);
        }
        if(board[board.length-1][i]=='O'){
            dfs(board,board.length-1,i);
        }
       } 
       for(int i=0; i<board.length; i++)
       {
        if(board[i][0]=='O')
        {
            dfs(board,i,0);
        }

        if(board[i][board[0].length-1]=='O')
        {
            dfs(board,i,board[0].length-1);
        }
       }
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }else if(board[i][j]=='#'){
                board[i][j]='O';
            }
        }
       }

    }
    private void dfs(char[][] board,int r,int c){
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!='O'){
            return ;
        }
        board[r][c]='#';
        for(int[] D:DIR){
            dfs(board,r+D[0],c+D[1]);
        }
    }
}