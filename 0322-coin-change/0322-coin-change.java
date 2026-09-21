class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[][] dp=new int[coins.length][amount+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int ans=f(coins,dp,coins.length-1,amount);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    private int f(int[] coins,int[][] dp,int ind,int rem){
        if(ind==0){
            if(rem%coins[0]==0) return rem/coins[0];
            return Integer.MAX_VALUE;
        }
        if(dp[ind][rem]!=-1) return dp[ind][rem];
        int notake=f(coins,dp,ind-1,rem);
        int take=Integer.MAX_VALUE;
        if(rem>=coins[ind]){
            int sub=f(coins,dp,ind,rem-coins[ind]);
            if(sub!=Integer.MAX_VALUE) take=1+sub;
            
        } 

        return dp[ind][rem]=Math.min(notake,take);
    }
}