class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans=new StringBuilder();
        ans.append(s);
        int i=0;
        int j=s.length()-1;
        System.out.print(ans);while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(isVowel(c1) && isVowel(c2)){
                swap(i,j,ans);
                i++;
                j--;
            }else if(isVowel(c1)){
                j--;
            }else if(isVowel(c2)){
                i++;
            }else{
                i++;
                j--;
            }
        }
        return ans.toString();

    }
    public void swap(int i,int j,StringBuilder sb){
        char temp=sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
}