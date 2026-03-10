class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        if(t.length()<s.length()){
            return false;
        }
        int cnt=0;
        int j=0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(j)==t.charAt(i)){
                cnt++;
                j++;
            }
            if(j>s.length()-1){
                break;
            }
        }
        return cnt==s.length();
    }
}