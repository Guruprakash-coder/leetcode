class Solution {
    int ans=0;
    public int findLength(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m =nums2.length;
        int[][] dp=new int[n+1][m+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                f(nums1, nums2, dp, i, j);
            }
        }
        return ans;
    }
    private int f(int[] nums1,int[] nums2,int[][] dp,int r,int c){
        if(r<=0 || c<=0){
            return 0;
        }
        if(dp[r][c]!=-1) return dp[r][c];
        if(nums1[r-1] == nums2[c-1]) {
            dp[r][c] = 1 + f(nums1, nums2, dp, r-1, c-1);
        }
        else {
            dp[r][c] = 0;
        }

        ans = Math.max(ans, dp[r][c]);

        return dp[r][c];
    }
}