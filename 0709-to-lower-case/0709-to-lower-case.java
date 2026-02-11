class Solution {
    public String toLowerCase(String s) {
        StringBuilder ns=new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            char ch=s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                ch+=32;
            }
            
            ns.append(ch);
        }
        return ns.toString();
    }
}