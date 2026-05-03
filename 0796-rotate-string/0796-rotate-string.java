class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        StringBuilder sb=new StringBuilder(s);
        if(sb.toString().equals(goal)){
            return true;
        }
        for(int i=0;i<s.length()-1;i++){
            char ch=sb.charAt(0);
            String n=sb.substring(1);
            sb.setLength(0);
            sb.append(n);
            sb.append(ch);
            
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}