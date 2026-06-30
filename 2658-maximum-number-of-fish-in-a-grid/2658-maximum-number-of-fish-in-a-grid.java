class Solution {
    public int findMaxFish(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    
                    max=Math.max(dfs(grid,i,j,new boolean[grid.length][grid[0].length]),max);
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid,int r,int c,boolean[][] vis){
        
        
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || vis[r][c] || grid[r][c]==0){
            return 0;
        }
        vis[r][c]=true;
        return grid[r][c]+dfs(grid,r+1,c,vis)+dfs(grid,r-1,c,vis)+dfs(grid,r,c+1,vis)+dfs(grid,r,c-1,vis);
    }
}