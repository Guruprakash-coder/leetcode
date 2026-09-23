class Solution {
     public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0){
                dp[0][i]=1;
            }
        }
        for(int ind=1;ind<coins.length;ind++){
            for(int amt=0;amt<=amount;amt++){
                int notake=dp[ind-1][amt];
                int take=0;
                if(amt>=coins[ind]) take=dp[ind][amt-coins[ind]];
                dp[ind][amt]=notake+take;
            }
        }
        return dp[coins.length-1][amount];
    }
    // public int change(int amount, int[] coins) {
    //     int[][] dp=new int[coins.length][amount+1];
    //     for(int[] d:dp){
    //         Arrays.fill(d,-1);
    //     }
    //     return f(coins,dp,coins.length-1,amount);
    // }
    // private int f(int[] coins,int[][] dp,int ind,int amt){
    //     if(amt==0) return 1;
    //     if(ind==0){
    //         if(amt%coins[0]==0) return 1;
    //         return 0;
    //     }
    //     if(dp[ind][amt]!=-1) return dp[ind][amt];

    //     int notake=f(coins,dp,ind-1,amt);
    //     int take=0;
    //     if(amt>=coins[ind]){
    //         take=f(coins,dp,ind,amt-coins[ind]);
    //     }
    //     return dp[ind][amt]=notake+take;
    // }
}