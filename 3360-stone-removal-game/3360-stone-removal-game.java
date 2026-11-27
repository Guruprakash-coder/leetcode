class Solution {
    public boolean canAliceWin(int n) {
        boolean aliceplaying=true;
        int count=10;
        while(n>0){
            if(count>n) return !aliceplaying;
            n-=count;
            count--;
            aliceplaying=!aliceplaying;
        } 
        return !aliceplaying;
    }
}