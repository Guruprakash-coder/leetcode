class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        String s2=sb.reverse().toString();
        
        int[][] dp=new int[s.length()+1][s2.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    continue;
                }
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        return dp[s.length()][s2.length()];

    }
    // public int longestPalindromeSubseq(String s) {
    //     StringBuilder sb=new StringBuilder(s);
    //     String s2=sb.reverse().toString();
        
    //     int[][] dp=new int[s.length()+1][s2.length()+1];
    //     for(int[] d:dp){
    //         Arrays.fill(d,-1);
    //     }
    //     return f(s,s2,dp,s.length(),s.length());

    // }
    // private int f(String s1,String s2,int[][] dp,int i,int j){
    //     if(i==0 || j==0){
    //         return 0;
    //     }
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     if(s1.charAt(i-1)==s2.charAt(j-1)){
    //         return dp[i][j]=1+f(s1,s2,dp,i-1,j-1);
    //     }
    //     int iskip=f(s1,s2,dp,i-1,j);
    //     int jskip=f(s1,s2,dp,i,j-1);
    //     return dp[i][j]=Math.max(iskip,jskip);
    // }
}