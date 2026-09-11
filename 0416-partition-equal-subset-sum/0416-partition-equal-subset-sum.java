class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        boolean[][] dp=new boolean[nums.length+1][target+1];
        for(int i=0;i<nums.length;i++){
            dp[i][0]=true;
        }
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=1;j<=target;j++){
                boolean notake=dp[i-1][j];
                boolean take=false;
                if(nums[i]<=j) take=dp[i-1][j-nums[i]];
                dp[i][j]=take || notake;
            }
        }
        return dp[nums.length-1][target];
    }
    // public boolean canPartition(int[] nums) {
    //     int sum=0;
    //     for(int num:nums){
    //         sum+=num;
    //     }
    //     if(sum%2!=0) return false;
    //     int target=sum/2;
    //     int[][] dp=new int[nums.length+1][target+1];
    //     for(int d[]:dp){
    //         Arrays.fill(d,-1);
    //     }
    //     return f(nums,dp,nums.length-1,target);
    // }
    // private boolean f(int[] nums,int[][] dp,int ind,int rem){
    //     if(rem==0) return true;
    //     if(ind==0) return rem==0;
        
    //     if(dp[ind][rem]!=-1) return dp[ind][rem]==1;
    //     boolean take=false;
    //     if(nums[ind]<=rem){
    //         take=f(nums,dp,ind-1,rem-nums[ind]);
    //     }
    //     if(take==true ) 
    //     {   
    //         dp[ind][rem]=1;
    //         return true;
    //     }
        
    //     boolean notake=f(nums,dp,ind-1,rem);
    //     dp[ind][rem]=(take||notake)?1:0;
    //     return take||notake;
    // }
}