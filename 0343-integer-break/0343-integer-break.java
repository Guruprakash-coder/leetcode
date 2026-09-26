class Solution {
    public int integerBreak(int n) {
        if(n<=1) return 0;
        int[][] dp=new int[n+1][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }

        return f(dp,n-1,n);
    }
    private int f(int[][] dp,int ind,int rem){
        if(rem==0 || ind==0){
            return 1;
        }
        if(dp[ind][rem]!=-1) return dp[ind][rem];
        int notake=f(dp,ind-1,rem);
        int take=0;
        if(rem>=ind) take=ind * f(dp,ind,rem-ind);
        return dp[ind][rem]=Math.max(take,notake);
    }
}