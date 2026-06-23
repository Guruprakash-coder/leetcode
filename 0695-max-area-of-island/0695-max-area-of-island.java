class Solution {
    int max=0;
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    count=0;
                    dfs(grid,i,j);
                }
            }
        }
        return max;
    }
    private void dfs(int[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length ||grid[r][c]==0){
            return;
        }
        grid[r][c]=0;
        count++;
        max=Math.max(max,count);
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
}