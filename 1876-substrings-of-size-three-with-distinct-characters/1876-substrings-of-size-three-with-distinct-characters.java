class Solution {
    public int countGoodSubstrings(String s) {
        int mid=1;
        int ans=0;
        while(mid<s.length()-1){
            if(s.charAt(mid-1)!=s.charAt(mid)&&s.charAt(mid)!=s.charAt(mid+1)&&s.charAt(mid-1)!=s.charAt(mid+1)){
                ans++;
            }
            mid++;
        }
        return ans;
    }
}