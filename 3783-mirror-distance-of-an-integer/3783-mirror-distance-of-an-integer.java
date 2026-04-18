class Solution {
    public int mirrorDistance(int n) {
        int n1=n;
        int num=0;
        while(n>0){
            num=num*10+n%10;
            n=n/10;
        }
        
        return Math.abs(num-n1);
    }
}