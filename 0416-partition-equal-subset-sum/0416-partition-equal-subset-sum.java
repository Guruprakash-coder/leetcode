class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        int[][] dp=new int[nums.length+1][target+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return f(nums,dp,nums.length-1,target);
    }
    private boolean f(int[] nums,int[][] dp,int ind,int rem){
        if(rem==0) return true;
        if(ind==0) return rem==0;
        
        if(dp[ind][rem]!=-1) return dp[ind][rem]==1;
        boolean take=false;
        if(nums[ind]<=rem){
            take=f(nums,dp,ind-1,rem-nums[ind]);
        }
        if(take==true ) return true;
        boolean notake=f(nums,dp,ind-1,rem);
        dp[ind][rem]=(take||notake)?1:0;
        return take||notake;
    }
}