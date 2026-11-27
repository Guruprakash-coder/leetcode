class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        String s2=sb.reverse().toString();
        
        int[][] dp=new int[s.length()+1][s2.length()+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return f(s,s2,dp,s.length(),s.length());

    }
    private int f(String s1,String s2,int[][] dp,int i,int j){
        if(i==0 || j==0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            return dp[i][j]=1+f(s1,s2,dp,i-1,j-1);
        }
        int iskip=f(s1,s2,dp,i-1,j);
        int jskip=f(s1,s2,dp,i,j-1);
        return dp[i][j]=Math.max(iskip,jskip);
    }
}