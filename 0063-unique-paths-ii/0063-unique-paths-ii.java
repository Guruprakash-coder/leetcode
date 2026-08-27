class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        if(obstacleGrid[n-1][m-1]==1 || obstacleGrid[0][0]==1) return 0;
        int[][] dp=new int[n][m];
        
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }

        return f(obstacleGrid,dp,n-1,m-1);
    }
    private int f(int[][] obstacleGrid,int[][] dp,int r,int c){
        if(r==0 && c==0) return 1;
        if(r<0 || c<0 || obstacleGrid[r][c]==1  ) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        dp[r][c]=f(obstacleGrid,dp,r-1,c)+f(obstacleGrid,dp,r,c-1);

        return dp[r][c];
    }
}