class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x;
        while(start<=end){
            int mid=(start+end)/2;
            long sq = (long) mid * mid; 
            if(sq==x){
                return mid;
            }
            if(sq>=x){
                end=mid-1;
            }else{
                start=mid+1;
            }
            
        }
        return end;    
    }
}