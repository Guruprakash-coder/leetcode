class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer,Integer>[] dp=new HashMap[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=new HashMap<>();
        }
        return f(nums,dp,nums.length-1,target);
    }
    private int f(int[] nums,Map<Integer,Integer>[] dp,int ind,int rem){
        if (ind == 0) {
            int ways = 0;

            if (rem == nums[0])
                ways++;

            if (rem == -nums[0])
                ways++;

            return ways;
        }
        if(dp[ind].containsKey(rem)){
            return dp[ind].get(rem);
        }
        int add=f(nums,dp,ind-1,rem+nums[ind]);
        int sub=f(nums,dp,ind-1,rem-nums[ind]);
        dp[ind].put(rem,add+sub);
        return dp[ind].get(rem);
    }
}