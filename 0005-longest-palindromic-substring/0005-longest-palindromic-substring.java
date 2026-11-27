class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder(s);
        String s2=sb.reverse().toString();
        String ans="";
        int[][] dp=new int[s.length()+1][s.length()+1];
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=s.length();j++){  
                if(s.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                if(dp[i][j]>ans.length()){
                    int cnt=dp[i][j];
                    StringBuilder curr=new StringBuilder();
                    int idx=i;
                    while(cnt>0){
                        curr.insert(0,s.charAt(idx-1));
                        cnt--;
                        idx--;
                    }
                    if(isPalindrome(curr)){
                        ans=curr.toString();
                    }
                }
            }
        }
        return ans;

    }
    private boolean isPalindrome(StringBuilder sb){
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}