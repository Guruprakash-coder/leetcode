class Solution {
    public int minOperations(int[] nums, int x) {
        int k=-x;
        for(int n:nums){
            k+=n;
        }
        if(k<0) return -1;
        int best=-1,i=0;s=0;
        for(int j=0;j<nums.length;j++){
            s+=nums[j];
            while(s>k){
                s-=nums[i++];
            }
            if(s==k){
                best=Math.max(best,j-i+1);
            }
        }
        return best<0?-1:nums.length-best;
    }
}