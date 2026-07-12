class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length-1;i++){
            int nopick=dp[i-1];
            int pick=i>1?dp[i-2]+nums[i]:0;

            dp[i]=Math.max(nopick,pick);
        }
        int[] dp2=new int[nums.length];
        dp2[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            int nopick=dp2[i-1];
            int pick=i>1?dp2[i-2]+nums[i]:0;

            dp2[i]=Math.max(nopick,pick); 
        }
        return Math.max(dp2[nums.length-1],dp[nums.length-2]);

    }
}