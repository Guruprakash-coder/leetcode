class Solution {
    public int minimumPushes(String word) {
        int tot=word.length();
        if(tot<=8) return tot;
        int ans=8;
        int inc=2;
        int itr=8;
        while(true){
            for(int i=1;i<=8;i++){
                itr++;
                if(itr>tot) break;
                ans+=inc;
                
            }
            inc++;
            if((itr)>tot) break;
        }
        return ans;
    }
}