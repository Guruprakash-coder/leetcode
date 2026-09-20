class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int prd=i+1;
            int rev='z'-s.charAt(i) + 1;
            ans+=rev*prd;
        }
        return ans;
    }
}