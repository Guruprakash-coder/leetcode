class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] d:dp){
            Arrays.fill(d,-1);

        }
        return f(text1,text2,dp,text1.length()-1,text2.length()-1);
    }
    private int f(String t1,String t2,int[][] dp,int n,int m){
        if(n<0 || m<0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(t1.charAt(n)==t2.charAt(m)){
            return dp[n][m]=1+f(t1,t2,dp,n-1,m-1);
        }
        int nskip=f(t1,t2,dp,n-1,m);
        int mskip=f(t1,t2,dp,n,m-1);
        return dp[n][m]=Math.max(nskip,mskip);
    }
}