class Solution {
    public int minFallingPathSum(int[][] matrix){
        int[][] dp=new int[matrix.length][matrix[0].length]; 
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int mini=Integer.MAX_VALUE;
                for(int k=0;k<matrix.length;k++){
                    if(j!=k){
                        mini=Math.min(mini,dp[i-1][k]+matrix[i][j]);
                    }
                    dp[i][j]=mini;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            ans=Math.min(ans,dp[matrix.length-1][i]);
        }
        return ans;
    }
    // public int minFallingPathSum(int[][] grid) {
    //     int[][] dp=new int[grid.length][grid.length];
    //     for(int[] d:dp){
    //         Arrays.fill(d,Integer.MAX_VALUE);
    //     }
    //     int ans=Integer.MAX_VALUE;
    //     for(int i=0;i<grid.length;i++){
    //         int mini=f(grid,dp,grid.length-1,i);
    //         ans=Math.min(mini,ans);
    //     }
    //     return ans;
    // }
    // private int f(int[][] grid,int[][] dp,int r,int c){
    //     if(r<0 || c<0 || r>=grid.length || c>= grid.length){
    //         return Integer.MAX_VALUE/2;
    //     }
    //     if(r==0){
    //         return grid[r][c];
    //     }
    //     if(dp[r][c]!=Integer.MAX_VALUE){
    //         return dp[r][c];
    //     }
    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<grid.length;i++){
    //         if(i!=c) {
    //             min=Math.min(min,f(grid,dp,r-1,i));
    //         }
            
    //     }

    //     return dp[r][c]=min+grid[r][c];
    // }
}