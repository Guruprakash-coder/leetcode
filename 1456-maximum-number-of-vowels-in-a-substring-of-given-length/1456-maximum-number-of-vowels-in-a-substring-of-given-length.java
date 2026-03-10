class Solution {
    public int maxVowels(String s, int k) {
        
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            
            char c1=s.charAt(i);
            if(isVowel(c1)){
                count++;
                }
                if(i>=k){
                    char left=s.charAt(i-k);
                    if(isVowel(left)){
                        count--;
                    }
                }
                max=Math.max(max,count);
        }
        return max;
    }
    public boolean isVowel(char c1){
         if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' ){
                    return true;
            }else{
                return false;
            }        
    }
}