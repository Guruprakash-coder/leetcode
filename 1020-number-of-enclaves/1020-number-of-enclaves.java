class Solution {
    private static int[][] DIR={
        {0,1},
        {0,-1},
        {1,0},
        {-1,0}
    };
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                dfs(grid,0,i);
            }
            if(grid[n-1][i]==1){
                dfs(grid,n-1,i);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                dfs(grid,i,0);
            }
            if(grid[i][m-1]==1){
                dfs(grid,i,m-1);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) ans++;
            }
        }
        return ans;
    }
    private void dfs(int[][] board,int r,int c){
        
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=1){
            return ;
        }
        board[r][c]=-1;
        for(int[] D:DIR){
            dfs(board,r+D[0],c+D[1]);
        }
    }
}