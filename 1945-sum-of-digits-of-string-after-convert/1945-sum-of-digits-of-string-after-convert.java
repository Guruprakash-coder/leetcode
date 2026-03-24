class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            num.append(s.charAt(i)-'a'+1);
        }
        
        int ans=0;
        for(int i=0;i<k;i++){
            ans=trans(num);
            
            num.setLength(0);
            num.append(ans);
        }
        return ans;
    }
    public int trans(StringBuilder sb){
        int ret=0;
        
        for(int i=0;i<sb.length();i++){
            ret+=sb.charAt(i)-'0';
            
        }
        return ret;
    }
}