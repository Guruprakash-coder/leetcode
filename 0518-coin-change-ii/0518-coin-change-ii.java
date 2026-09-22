class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return f(coins,dp,coins.length-1,amount);
    }
    private int f(int[] coins,int[][] dp,int ind,int amt){
        if(amt==0) return 1;
        if(ind==0){
            if(amt%coins[0]==0) return 1;
            return 0;
        }
        if(dp[ind][amt]!=-1) return dp[ind][amt];

        int notake=f(coins,dp,ind-1,amt);
        int take=0;
        if(amt>=coins[ind]){
            take=f(coins,dp,ind,amt-coins[ind]);
        }
        return dp[ind][amt]=notake+take;
    }
}