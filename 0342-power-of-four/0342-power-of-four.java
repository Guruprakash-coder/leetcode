class Solution {
    public boolean isPowerOfFour(int n) {
       if(n==1){
        return true;
       } 
       if(n<4){
        return false;
       }
       return helper(n);
    }
    boolean helper(int n){
        if(n==4){
            return true;
        }
        if(n%4 != 0){
            return false;
        }
        return helper(n/4);
    }
}