class Solution {
    private static final int[][] DIR={
        {1,0} ,{-1,0},{0,1},{0,-1}
    };
    public boolean containsCycle(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[] vis=new boolean[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i*n+j]){
                    boolean check=dfs(vis,grid,i,j,-1,-1,m,n);
                    if(check) return true;
                }
            }
        }
        return false;
    }
    private boolean dfs(boolean[] visit,char[][] grid,int r,int c,int pr , int pc,int m,int n){
        visit[r * n + c] = true;
        for (int[] d : DIR) {
            int nr = r + d[0];
            int nc = c + d[1];
            if (nr != pr || nc != pc)
                if (nr >= 0 && nr < m && nc >= 0 && nc < n)
                    if (grid[nr][nc] == grid[r][c])
                        if (visit[nr * n + nc] || dfs(visit,grid,nr, nc, r, c, m, n))
                            return true;
        }
        return false;

    }
}