class Solution {
    public int findMaxFish(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    
                    max=Math.max(dfs(grid,i,j),max);
                }
            }
        }
        return max;
    }
    private int dfs(int[][] grid,int r,int c){
        
        
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length ||  grid[r][c]==0){
            return 0;
        }
        int fish=grid[r][c];
        grid[r][c]=0;
        return fish+dfs(grid,r+1,c)+dfs(grid,r-1,c)+dfs(grid,r,c+1)+dfs(grid,r,c-1);
    }
}