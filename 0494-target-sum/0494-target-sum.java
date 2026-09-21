class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        
        int tot=0;
        for(int n:nums){
            tot+=n;
        }
        if(tot<target || (tot-target)%2!=0) return 0;
        int[][] dp=new int[nums.length][(tot-target)/2+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        
        return f(nums,dp,nums.length-1,(tot-target)/2);
    }
    private int f(int[] nums,int[][] dp,int ind,int rem){
        if(ind==0){
            if (rem == 0 && nums[0] == 0) return 2;
            if(rem==0 || rem==nums[0]) return 1;
            return 0;
        }
        if(dp[ind][rem]!=-1) return dp[ind][rem];
        int notake=f(nums,dp,ind-1,rem);
        int take=0;
        if(nums[ind]<=rem) take=f(nums,dp,ind-1,rem-nums[ind]);
        return dp[ind][rem]=notake+take;
    }
    
}