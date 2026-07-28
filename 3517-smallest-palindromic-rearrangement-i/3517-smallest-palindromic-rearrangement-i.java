class Solution {
    public String smallestPalindrome(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        char[] ans=new char[s.length()];
        int i=0;
        int j=s.length()-1;
        char excep=' ';
        for(int z=0;z<26;z++){
            while(freq[z]>0){
                if(freq[z]==1) {
                    excep=(char)(z+'a');
                    break;
                
                }
                freq[z]-=2;
                ans[i]=ans[j]=(char)(z+'a');
                i++;
                j--;
            }
        }
        if(excep!=' ') ans[i]=excep;
        return new String(ans);
    }
}