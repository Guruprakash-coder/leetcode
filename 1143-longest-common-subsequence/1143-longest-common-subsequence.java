class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    continue;
                }
                int skipn=dp[i-1][j];
                int skipm=dp[i][j-1];
                dp[i][j]=Math.max(skipn,skipm);
            }
            
        }
        return dp[n][m];
    }
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int[][] dp=new int[text1.length()][text2.length()];
    //     for(int[] d:dp){
    //         Arrays.fill(d,-1);

    //     }
    //     return f(text1,text2,dp,text1.length()-1,text2.length()-1);
    // }
    // private int f(String t1,String t2,int[][] dp,int n,int m){
    //     if(n<0 || m<0){
    //         return 0;
    //     }
    //     if(dp[n][m]!=-1){
    //         return dp[n][m];
    //     }
    //     if(t1.charAt(n)==t2.charAt(m)){
    //         return dp[n][m]=1+f(t1,t2,dp,n-1,m-1);
    //     }
    //     int nskip=f(t1,t2,dp,n-1,m);
    //     int mskip=f(t1,t2,dp,n,m-1);
    //     return dp[n][m]=Math.max(nskip,mskip);
    // }
}