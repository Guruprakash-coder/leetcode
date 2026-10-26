class Solution {
    private long dfs(int[][] grid,int n,int m,int r,int c){
        if(r<0 || c<0 || r>=n || c>=m || grid[r][c]==0){
            return 0;
        }
        
        long sum=grid[r][c];
        grid[r][c]=0;
        sum+=dfs(grid,n,m,r+1,c);
        sum+=dfs(grid,n,m,r-1,c);
        sum+=dfs(grid,n,m,r,c+1);
        sum+=dfs(grid,n,m,r,c-1);
        return sum;

    }
    public int countIslands(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                    if(dfs(grid,n,m,i,j)%k==0)count++;
                }
            }
        }
        return count;
    }
}