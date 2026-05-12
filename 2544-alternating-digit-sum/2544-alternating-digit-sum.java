class Solution {
    public int alternateDigitSum(int n) {
        int sign=diglen(n)%2==0?-1:1;
        int ans=0;
        while(n>0){
            int r=n%10;
            ans=ans+(sign*r);
            sign*=-1;
            n=n/10;
        }
        return ans;
    }
    private int diglen(int n){
        int ans=0;
        while(n>0){
            ans++;
            n=n/10;
        }
        return ans;
    }
}