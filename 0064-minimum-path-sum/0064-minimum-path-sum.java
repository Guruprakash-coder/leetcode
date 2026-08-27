class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        dp[0][0]=grid[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                int up=i==0?Integer.MAX_VALUE:grid[i][j]+dp[i-1][j];
                int left=j==0?Integer.MAX_VALUE:grid[i][j]+dp[i][j-1];
                dp[i][j]=Math.min(up,left);
            }
        }
        return dp[n-1][m-1];
     
    }
    // public int minPathSum(int[][] grid) {
    //     int n=grid.length;
    //     int m=grid[0].length;
    //     int[][] dp=new int[n][m];
    //     for(int[] d:dp){
    //         Arrays.fill(d,-1);
    //     }
    //     return f(grid,dp,n-1,m-1);
    // }
    // private int f(int[][] grid,int[][] dp,int r,int c){
    //     if(r==0 && c==0){
    //         return grid[0][0];
    //     }
    //     if(r<0 || c<0) return 100000;
    //     if(dp[r][c]!=-1) return dp[r][c];

    //     int left=f(grid,dp,r,c-1)+grid[r][c];
    //     int right=f(grid,dp,r-1,c)+grid[r][c];
    //     dp[r][c]=Math.min(left,right);

    //     return dp[r][c];
    // }
}