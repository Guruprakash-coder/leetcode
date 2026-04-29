class Solution {
    public int countAsterisks(String s) {
        boolean isTrapped=false;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                if(isTrapped){
                    isTrapped=false;
                }else{
                    isTrapped=true;
                }
            }
            if(s.charAt(i)=='*'&&!isTrapped){
                ans++;
            }
        }
        return ans;
    }
}