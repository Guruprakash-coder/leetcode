class Solution {
    public int longestPalindrome(String s) {
        int[] freqa=new int[26];
        int[] freqA=new int[26];
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                freqa[ch-'a']++;
            }else{
                freqA[ch-'A']++;
            }
            
        }
        int ans=0;
        boolean ctra=false;
        for(int i=0;i<26;i++){
            while(freqA[i]>=2){
                ans+=2;
                freqA[i]=freqA[i]-2;
            }
            
            if(freqA[i]==1) ctra=true;
        }
        for(int i=0;i<26;i++){
            while(freqa[i]>=2){
                ans+=2;
                freqa[i]=freqa[i]-2;
            }
            
            if(freqa[i]==1) ctra=true;
        }
        return ctra?ans+1:ans;
    }
}