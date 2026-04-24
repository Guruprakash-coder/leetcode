class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int rc=0;
        int lc=0;
        int uc=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                rc++;
            }else if(moves.charAt(i)=='L'){
                lc++;
            }else{
                uc++;
            }
        }
        int ans=0;
        if(lc>rc){
            ans=uc+lc-rc;
        }else{
            ans=uc+rc-lc;
        }
        return ans;
    }
}