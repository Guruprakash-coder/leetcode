class Solution {
     public boolean validPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       boolean oneign=false;
        while(i<j){
            
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1!=c2){
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
        
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1!=c2){
                return false;

            }
            i++;
            j--;
        }
        return true;
    }
}