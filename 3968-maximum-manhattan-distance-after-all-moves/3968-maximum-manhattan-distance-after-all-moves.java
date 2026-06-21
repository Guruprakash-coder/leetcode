class Solution {
    public int maxDistance(String moves) {
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        int ind=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U'){
                u++;
            }else if(ch=='D'){
                d++;
            }else if(ch=='R'){
                r++;
            }else if(ch=='L'){
                l++;
            }else{
                ind++;
            }
        }
        return Math.abs(r-l)+Math.abs(u-d)+ind;
    }
                     
}