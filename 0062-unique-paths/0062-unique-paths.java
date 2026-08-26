class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return f(m-1,n-1,dp);
    }
    private int f(int r,int c,int[][] dp){
        if(r==0 && c==0) return 1;
        if(r<0 || c<0) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        
        dp[r][c]=f(r-1,c,dp)+f(r,c-1,dp);
        return dp[r][c];
    }
}