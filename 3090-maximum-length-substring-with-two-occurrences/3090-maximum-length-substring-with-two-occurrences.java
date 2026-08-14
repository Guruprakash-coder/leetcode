class Solution {
    public int maximumLengthSubstring(String s) {
       int ans=0;
       int[] freq=new int[26];
       for(int i=0,j=0;j<s.length();j++){
        char ch=s.charAt(j);
        freq[ch-'a']++;
        while(freq[ch-'a']>2){
            char chi=s.charAt(i);
            freq[chi-'a']--;
            i++;
        }
        ans=Math.max(ans,j-i+1);
       } 
       return ans;
    }
}