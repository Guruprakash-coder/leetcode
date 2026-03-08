class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        StringBuilder word=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            char c1=s.charAt(i);
            if(c1==' '){
                if(word.length()>0){
                    word.reverse();
                    ans.append(word);
                    ans.append(' ');
                    word.setLength(0);
                }
            }else{
                word.append(c1);
            }
            
            i--;
        }
        if(word.length()>0){
            word.reverse();
            ans.append(word);
        }
        return ans.toString().trim();
    }
}