class Solution {
    public boolean checkOnesSegment(String s) {
        
        int pieces=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0' && s.charAt(i-1)=='1'){
                pieces++;
            }
            if(s.charAt(i)=='1' && s.charAt(i-1)!='1'){
                pieces++;
            }
        }
        if(pieces>1){
            return false;
        }
        return true;
    }
}