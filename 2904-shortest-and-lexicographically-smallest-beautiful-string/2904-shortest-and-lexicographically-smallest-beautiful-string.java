class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int cnt=0;

        String ans="";
        
        
        for(int i=0,j=0;j<s.length();j++){
            
            
            
            if(s.charAt(j)=='1'){
                cnt++; 
            }
            
            
            
            while(cnt>k){
                if(s.charAt(i)=='1') cnt--;
                
                
                i++;
            }

            
            if(cnt==k ){
                while(s.charAt(i)=='0') i++;
                String curr=s.substring(i,j+1);
                if(ans.equals("")|| curr.length()<ans.length() || (curr.length()==ans.length() && curr.compareTo(ans)<0)){
                    ans=curr;
                }
            }
            
        }
        return ans;
    }
}