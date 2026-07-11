class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        return dyn(nums,dp,nums.length-1);

    }
    private int dyn(int[] nums,int[] dp,int i){
        if(i<0) return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int nopick=dyn(nums,dp,i-1);
        int pick=dyn(nums,dp,i-2);
        
        dp[i]=Math.max(pick+nums[i],nopick);
        return dp[i];
    }
}