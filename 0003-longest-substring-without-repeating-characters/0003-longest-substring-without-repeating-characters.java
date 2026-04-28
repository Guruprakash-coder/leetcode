class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
       Queue<Character> q=new LinkedList<>();
       
       int max=1;
       q.add(s.charAt(0));
       for(int j=1;j<s.length();j++){
        char ch=s.charAt(j);
        if(isAvail(q,ch)){
            while(isAvail(q,ch)){
                q.poll();
                
            }

            q.add(ch);
            
        }else{
            
            q.add(ch);
            max=Math.max(max,q.size());
        }
        
       }
       return max;
    }
    boolean isAvail(Queue<Character> q,char ch){
        for(char c:q){
            if(c==ch){
                return true;
            }
        }
        return false;
    }



    
}