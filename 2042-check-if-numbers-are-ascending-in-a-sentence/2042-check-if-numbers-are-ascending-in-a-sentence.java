class Solution {
    public boolean areNumbersAscending(String s) {
      int prev=0;
      for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
            int curr=s.charAt(i)-'0';
            while(i+1<s.length() && Character.isDigit(s.charAt(i+1))){
                curr=curr*10 + s.charAt(i+1)-'0';
                i++;
            }
            if(prev>=curr){
                return false;
            }else{
                prev=curr;
            }
            
        }
      }
      return true;  
    }
}