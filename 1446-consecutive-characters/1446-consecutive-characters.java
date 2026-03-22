class Solution {
    public int maxPower(String s) {
        if(s.length()==1){
            return 1;
        }
        int max=0;
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
                max=Math.max(cnt,max);
            }
            if(s.charAt(i)!=s.charAt(i-1)){
                max=Math.max(cnt,max);
                cnt=1;
            }
        }
        return max;
    }
}