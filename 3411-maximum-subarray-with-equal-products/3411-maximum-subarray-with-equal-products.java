class Solution {
    public int maxLength(int[] nums) {
        int mul=1;
        int res=2;
        int i=0;
        int j=0;
        while(j<nums.length){
            while(gcd(mul,nums[j])>1){
                mul/=nums[i];
                i++;
            }
            mul*=nums[j];
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
    private int gcd(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}