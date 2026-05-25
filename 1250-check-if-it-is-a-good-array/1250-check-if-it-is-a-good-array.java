class Solution {
    public boolean isGoodArray(int[] nums) {
        int cgcd=0;
        for(int n:nums){
            cgcd=gcd(cgcd,n);
            if(cgcd==1){
                return true;
            }
        }
        return false;
    }
    int gcd(int a,int b){
        if(b==0){
            return a;
        }

        return gcd(b,a%b);


    }
}