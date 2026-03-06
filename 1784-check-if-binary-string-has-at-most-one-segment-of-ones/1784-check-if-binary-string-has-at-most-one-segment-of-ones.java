class Solution {
    public boolean checkOnesSegment(String s) {
        
        int pieces=0;
        if(s.charAt(0)=='1'){
            pieces++;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0'){
                pieces++;
            }
        }
        return pieces<=1;
    }
}