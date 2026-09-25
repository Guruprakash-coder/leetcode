class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp=new int[nums.size()][target+1];
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }

        int ans= f(nums,dp,nums.size()-1,target);
        return ans<=0?-1:ans;
    }
    private int f(List<Integer> nums,int[][] dp,int ind,int rem){
        if(rem==0){
            return 0;
        }
        if(ind==0){
            if(rem==nums.get(0)) return 1;
            return -1000000;
        }
        if(dp[ind][rem]!=-1) return dp[ind][rem];
        int notake=f(nums,dp,ind-1,rem);
        int take=-1000000;
        if(rem>=nums.get(ind)) take=1+f(nums,dp,ind-1,rem-nums.get(ind));
        
        return dp[ind][rem]=Math.max(take,notake);
    }
}