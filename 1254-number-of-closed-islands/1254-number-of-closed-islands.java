class Solution {
    private boolean closed(int i,int j,int[][] grid,int n,int m){
        if(i<0 || j<0 || j>=m || i>=n) return false;
        if(grid[i][j]==1) return true;
        grid[i][j]=1;
        return closed(i+1,j,grid,n,m) & closed(i-1,j,grid,n,m) & closed(i,j+1,grid,n,m) & closed(i,j-1,grid,n,m);
    }
    public int closedIsland(int[][] grid) {
       int count=0;
       int n=grid.length;
       int m=grid[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==0 && closed(i,j,grid,n,m)) count++;
        }
       } 
       return count;
    }
}