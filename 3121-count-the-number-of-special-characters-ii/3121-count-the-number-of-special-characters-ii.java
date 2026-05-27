class Solution {
    public int numberOfSpecialChars(String word) {
        int[] UC = new int[26];
        int[] LC = new int[26];
        Arrays.fill(UC, -1);
        Arrays.fill(LC, -1);
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            
            if(Character.isUpperCase(ch)){
                if(UC[ch-'A']==-1){
                    UC[ch-'A']=i;
                }
                
            }else{
                LC[ch-'a']=i;
            }
        }
        int ans=0;
        for(int i=0;i<26;i++){
            int n1=UC[i];
            int n2=LC[i];
            if(n2!=-1 && n1!=-1){
                if(n2<n1){
                    ans++;
                }
            }
        }
        return ans;
    }
}