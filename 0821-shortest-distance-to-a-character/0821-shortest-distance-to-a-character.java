class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int m=s.length();
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch==c){
                   m=Math.min(Math.abs(j-i),m);
                }
            }
            ans[i]=m;

        }
        return ans;
    }
}