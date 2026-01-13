class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n<=2){
            return false;
        }
        
        return helper(n);
    }
    boolean helper(int n){
        if(n==3){
            return true;
        }
        if(n%3 !=0){
            return false;
        }
        return helper(n/3);
    }
}