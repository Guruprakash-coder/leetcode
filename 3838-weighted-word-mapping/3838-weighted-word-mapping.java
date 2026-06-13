class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans=new StringBuilder();
        for(String word:words){
            int n=0;
            for(char ch:word.toCharArray()){
                int idx=ch-'a';
                n+=weights[idx];
            }
            n%=26;
            
            ans.append((char)('z'-n));
        }
        return ans.toString();
    }
}